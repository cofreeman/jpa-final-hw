package com.nhnacademy.springjpa.entity;


import com.nhnacademy.springjpa.IdClasses.BirthDeathReportResidentId;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "birth_death_report_resident")
public class BirthDeathReportResident {

    @EmbeddedId
    private BirthDeathReportResidentId birthDeathReportResidentId;

    @MapsId("residentSerialNumber")
    @ManyToOne
    @JoinColumn(name = "resident_serial_number")
    private Resident resident;

    @Column(name = "birth_death_report_date")
    private Date birthDeathReportDate;

    @Column(name = "birth_report_qualifications_code ")
    private String birthReportQualificationsCode;

    @Column(name = "death_report_qualifications_code")
    private String deathReportQualificationsCode;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "phone_number ")
    private String phoneNumber;

//    create table birth_death_report_resident
//            (
//                    resident_serial_number           int(11)     not null,
//    birth_death_type_code            varchar(20) not null,
//    report_resident_serial_number    int(11)     not null,
//    birth_death_report_date          date        not null,
//    birth_report_qualifications_code varchar(20) null,
//    death_report_qualifications_code varchar(20) null,
//    email_address                    varchar(50) null,
//    phone_number                     varchar(20) not null,
//    primary key (resident_serial_number, birth_death_type_code)
//);
}
