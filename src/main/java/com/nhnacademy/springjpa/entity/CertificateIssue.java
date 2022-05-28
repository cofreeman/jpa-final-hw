package com.nhnacademy.springjpa.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "certificate_issue")
public class CertificateIssue {

    @Id
    @Column(name = "certificate_confirmation_number")
    private Long certificateConfirmationNumber;

    @ManyToOne
    @JoinColumn(name = "resident_serial_number")
    private Resident resident;

    @Column(name = "certificate_type_code")
    private String certificateTypeCode;

    @Column(name = "certificate_issue_date")
    private Date certificateIssueDate;

}

//create table certificate_issue
//    (
//            certificate_confirmation_number bigint      not null,
//            resident_serial_number          int         not null,
//            certificate_type_code           varchar(20) not null,
//    certificate_issue_date          date        not null,
//    primary key (certificate_confirmation_number)
//    );
