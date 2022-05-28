package com.nhnacademy.springjpa.IdClasses;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

@Embeddable
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class HouseholdMovementAddressId implements Serializable {

    @Column(name = "house_movement_report_date")
    private Date houseMovementReportDate;

    private int householdSerialNumber;
}
