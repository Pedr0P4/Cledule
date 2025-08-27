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

    @Override
    public void run(String... args) throws Exception {

        ClassUser cu1 = new ClassUser("Pedro Paulo", Role.INSTRUCTOR, "pedro@gmail.com");
        ClassUser cu2 = new ClassUser("Cecília Cerqueira", Role.TUTOR, "cecilia@gmail.com");

        classUserRepository.saveAll(Arrays.asList(cu1, cu2));

        Division dv1 = new Division("Division 1");

        divisionRepository.save(dv1);

        Department dp1 = new Department("Departamento 1", dv1);
        Department dp2 = new Department("Departamento 2", dv1);

        departmentRepository.saveAll(Arrays.asList(dp1, dp2));

        dv1.getDepartments().add(dp1);
        dv1.getDepartments().add(dp2);

        divisionRepository.save(dv1);

        Space s1 = new Space("Sala 1", 40, 1, dp1);
        Space s2 = new Space("Sala 2", 20, 2, dp2);
        Space s3 = new Space("Auditorio 1", 120, 3, dp1);
        Space s4 = new Space("Auditorio 2", 80, 3, dp2);

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

        Reservation r1 = new Reservation("Aula de LP1", LocalDateTime.now(), LocalDateTime.of(2025, 8, 20, 14, 0), ReservationStatus.WAITING, cu1, s2);
        Reservation r2 = new Reservation("Aula de Histologia", LocalDateTime.now(), LocalDateTime.of(2025, 8, 22, 16, 0), ReservationStatus.WAITING, cu2, s1);
        Reservation r3 = new Reservation("Aula de APOO", LocalDateTime.now(), LocalDateTime.of(2025, 8, 19, 12, 0), ReservationStatus.WAITING, cu1, s4);
        Reservation r4 = new Reservation("Aula de Anatomia", LocalDateTime.now(), LocalDateTime.of(2025, 8, 24, 7, 30), ReservationStatus.WAITING, cu2, s3);

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
