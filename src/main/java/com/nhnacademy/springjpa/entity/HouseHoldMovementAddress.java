package com.nhnacademy.springjpa.entity;

import com.nhnacademy.springjpa.IdClasses.HouseholdMovementAddressId;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "household_movement_address")
public class HouseHoldMovementAddress {

    @EmbeddedId HouseholdMovementAddressId householdMovementAddressId;

    @MapsId("householdSerialNumber")
    @ManyToOne
    @JoinColumn(name = "household_serial_number")
    private HouseHold houseHold;

    @Column(name = "house_movement_address")
    private String houseMovementAddress;

    @Column(name = "last_address_yn")
    private String lastAddressYn;

}
