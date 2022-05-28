package com.nhnacademy.springjpa.entity;

import com.nhnacademy.springjpa.IdClasses.HouseholdCompositionResidentId;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "household_composition_resident")
public class HouseholdCompositionResident {

    @EmbeddedId
    private HouseholdCompositionResidentId householdCompositionResidentId;

    @MapsId("residentSerialNumber")
    @ManyToOne
    @JoinColumn(name = "resident_serial_number")
    private Resident resident;

    @MapsId("householdSerialNumber")
    @ManyToOne
    @JoinColumn(name = "household_serial_number")
    private HouseHold houseHold;

    @Column(name = "report_date")
    private Date reportDate;

    @Column(name = "household_relationship_code")
    private  String householdRelationshipCode;

    @Column(name = "household_composition_change_reason_code ")
    private String householdCompositionChangeReasonCode;

}
