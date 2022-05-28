package com.nhnacademy.springjpa.IdClasses;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class HouseholdCompositionResidentId implements Serializable {

    private int householdSerialNumber;

    private int residentSerialNumber;
}
