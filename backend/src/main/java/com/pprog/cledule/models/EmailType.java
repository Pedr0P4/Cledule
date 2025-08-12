package com.pprog.cledule.models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailType {
    private String emailName;
    private String emailDomain;

    private static final Pattern PADRAO_EMAIL = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    static public boolean isValid(String email){
        if(email != null) {
            Matcher matcher = PADRAO_EMAIL.matcher(email);
            if(!email.isEmpty()) return matcher.matches();
        }
        return false;
    }
    static public String getOtherEmailName(String email){
        if(!isValid(email)) return null;
        return email.substring(0, email.indexOf("@"));
    }
    static public String getOtherEmailDomain(String email){
        if(!isValid(email)) return null;
        return email.substring(email.indexOf("@")+1);
    }

    public EmailType(){}

    public EmailType(String emailName, String emailDomain) {
        this.emailName = emailName;
        this.emailDomain = emailDomain;
    }

    public String getEmailName() {
        return emailName;
    }

    public void setEmailName(String emailName) {
        this.emailName = emailName;
    }

    public String getEmailDomain() {
        return emailDomain;
    }

    public void setEmailDomain(String emailDomain) {
        this.emailDomain = emailDomain;
    }

    @Override
    public String toString() {
        return emailName + "@" +  emailDomain;
    }
}
