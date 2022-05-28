package com.nhnacademy.springjpa.entity;

import com.nhnacademy.springjpa.IdClasses.FamilyRelationshipId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "family_relationship")
public class FamilyRelationship {

    @EmbeddedId
    private FamilyRelationshipId familyRelationshipIdClass;

    @MapsId("baseResidentSerialNumber")
    @ManyToOne
    @JoinColumn(name = "base_resident_serial_number")
    private Resident resident;

    @Column(name = "family_relationship_code")
    private String familyRelationshipCode;


}
