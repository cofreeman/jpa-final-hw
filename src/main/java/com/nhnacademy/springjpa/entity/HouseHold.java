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
@Table(name = "household")
public class HouseHold {

    @Id
    @Column(name = "household_serial_number")
    private int householdSerialNumber;

    @ManyToOne
    @JoinColumn(name = "household_resident_serial_number")
    private Resident resident;

    @Column(name = "household_composition_date")
    private Date householdCompositionDate;

    @Column(name = "household_composition_reason_code")
    private String householdCompositionReason_code;

    @Column(name = "current_house_movement_address")
    private Date currentHouseMovementAddress;

}
