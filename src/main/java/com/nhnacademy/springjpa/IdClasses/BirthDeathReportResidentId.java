package com.nhnacademy.springjpa.IdClasses;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Id;
import java.io.Serializable;


@Embeddable
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class BirthDeathReportResidentId implements Serializable {

    private int residentSerialNumber;

    @Column(name = "birth_death_type_code")
    private String birthDeathTypeCode;

    @Column(name = "report_resident_serial_number")
    private int reportResidentSerialNumber;
}
