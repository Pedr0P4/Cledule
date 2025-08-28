package com.pprog.cledule.config;

import com.pprog.cledule.entities.*;
import com.pprog.cledule.enums.ReservationStatus;
import com.pprog.cledule.enums.Role;
import com.pprog.cledule.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDateTime;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ClassUserRepository classUserRepository;
    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private SpaceRepository spaceRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private DivisionRepository divisionRepository;
    @Autowired
    private EquipmentRepository equipmentRepository;
    @Autowired
    private DepartmentAdminRepository departmentAdminRepository;
    @Autowired
    private DivisionAdminRepository divisionAdminRepository;
    @Autowired
    private GeneralAdminRepository generalAdminRepository;

    @Override
    public void run(String... args) throws Exception {

        GeneralAdmin gna1 = new GeneralAdmin("Denise Karen", "denikaren@email.com", "112233445");
        DivisionAdmin dva1 = new DivisionAdmin("Geraldo Bubon", "geraldin@liame.moc", "12365498");
        DepartmentAdmin dpa1 = new DepartmentAdmin("Bob Herbert", "bobh@email.com", "12345678");
        DepartmentAdmin dpa2 = new DepartmentAdmin("Nuna Filho", "nunaf@email.com", "87654321");

        generalAdminRepository.save(gna1);
        divisionAdminRepository.save(dva1);
        departmentAdminRepository.save(dpa1);
        departmentAdminRepository.save(dpa2);

        SpaceUser su1 = new SpaceUser("Pedro Paulo", Role.INSTRUCTOR, "pedro@gmail.com");
        SpaceUser su2 = new SpaceUser("Cecília Cerqueira", Role.TUTOR, "cecilia@gmail.com");

        classUserRepository.saveAll(Arrays.asList(su1, su2));

        Division dv1 = new Division("Division 1", gna1);

        divisionRepository.save(dv1);

        Department dp1 = new Department("Departamento 1", dv1, dva1);
        Department dp2 = new Department("Departamento 2", dv1, dva1);

        departmentRepository.saveAll(Arrays.asList(dp1, dp2));

        dv1.getDepartments().add(dp1);
        dv1.getDepartments().add(dp2);

        divisionRepository.save(dv1);

        Space s1 = new Space("Sala 1", 40, 1, dp1, dpa1);
        Space s2 = new Space("Sala 2", 20, 2, dp2, dpa2);
        Space s3 = new Space("Auditorio 1", 120, 3, dp1, dpa1);
        Space s4 = new Space("Auditorio 2", 80, 3, dp2, dpa2);

        spaceRepository.saveAll(Arrays.asList(s1, s2, s3, s4));

        dp1.getSpaces().add(s1);
        dp2.getSpaces().add(s2);
        dp1.getSpaces().add(s3);
        dp2.getSpaces().add(s4);

        departmentRepository.saveAll(Arrays.asList(dp1, dp2));

        Equipment e1 = new Equipment("Projetor");
        Equipment e2 = new Equipment("Quadro");
        Equipment e3 = new Equipment("Microfone");
        Equipment e4 = new Equipment("Caixa de som");

        equipmentRepository.saveAll(Arrays.asList(e1, e2, e3, e4));

        Reservation r1 = new Reservation("Aula de LP1", LocalDateTime.now(), LocalDateTime.of(2025, 8, 20, 14, 0), ReservationStatus.WAITING, su1, s2, dpa1);
        Reservation r2 = new Reservation("Aula de Histologia", LocalDateTime.now(), LocalDateTime.of(2025, 8, 22, 16, 0), ReservationStatus.WAITING, su2, s1, dpa1);
        Reservation r3 = new Reservation("Aula de APOO", LocalDateTime.now(), LocalDateTime.of(2025, 8, 19, 12, 0), ReservationStatus.WAITING, su1, s4, dpa1);
        Reservation r4 = new Reservation("Aula de Anatomia", LocalDateTime.now(), LocalDateTime.of(2025, 8, 24, 7, 30), ReservationStatus.WAITING, su2, s3, dpa2);

        reservationRepository.saveAll(Arrays.asList(r1, r2, r3, r4));

        s1.getEquipments().add(e1);
        s1.getEquipments().add(e2);
        s2.getEquipments().add(e1);
        s2.getEquipments().add(e2);
        s3.getEquipments().add(e1);
        s3.getEquipments().add(e2);
        s3.getEquipments().add(e3);
        s3.getEquipments().add(e4);
        s4.getEquipments().add(e1);
        s4.getEquipments().add(e2);
        s4.getEquipments().add(e3);
        s4.getEquipments().add(e4);

        s1.getReservations().add(r2);
        s2.getReservations().add(r1);
        s3.getReservations().add(r4);
        s4.getReservations().add(r3);

        spaceRepository.saveAll(Arrays.asList(s1, s2, s3, s4));
    }
}
