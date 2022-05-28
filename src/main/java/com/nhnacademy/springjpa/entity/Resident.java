package com.nhnacademy.springjpa.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "resident")
public class Resident {

    @Id
    @Column(name = "resident_serial_number")
    private int residentSerialNumber;

    @Column(name ="name")
    private String name;

    @Column(name = "resident_registration_number")
    private String residentRegistrationNumber;

    @Column(name = "gender_code")
    private  String genderCode;

    @Column(name = "birth_date ")
    private Date birthDate;

    @Column(name = "birth_place_code")
    private String birthPlaceCode;

    @Column(name = "register_base_address")
    private String registerBaseAddress;

    @Column(name = "death_date")
    private Date deathDate;

    @Column(name = "death_place_code")
    private String deathPlaceCode;

    @Column(name = "death_place_address")
    private String deathPlaceAddress;

    @OneToMany(mappedBy = "resident")
    private List<CertificateIssue> certificateIssues;

    @OneToMany(mappedBy = "resident")
    private List<HouseHold> houseHolds;





//    resident_serial_number       int(11)      not null,
//    name                         varchar(100) not null,
//    resident_registration_number varchar(300) not null,
//    gender_code                  varchar(20)  not null,
//    birth_date                   datetime     not null,
//    birth_place_code             varchar(20)  not null,
//    registration_base_address    varchar(500) not null,
//    death_date                   datetime     null,
//    death_place_code             varchar(20)  null,
//    death_place_address          varchar(500) null,
}
