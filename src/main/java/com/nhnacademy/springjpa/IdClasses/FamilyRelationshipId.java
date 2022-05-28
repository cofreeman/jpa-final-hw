package com.nhnacademy.springjpa.IdClasses;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class FamilyRelationshipId implements Serializable {

    private int baseResidentSerialNumber;
    @Column(name ="family_resident_serial_number")
    private int familyResidentSerialNumber;

}
