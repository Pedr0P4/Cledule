package com.pprog.cledule.models;

public class EmailType {
    private String emailName;
    private String emailDomain;

    static public boolean isValid(String email){}
    static public String getOtherEmailName(String email){}
    static public String getOtherEmailDomain(String email){}

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
}
