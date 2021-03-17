package com.papaya.hibernate_understanding;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.PrePersist;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("PERSONSSS")
public class Person {



    @PrePersist
    public void preparePersonForSaving(){
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
    }

    private String lastName;
    private String firstName;
    private int salary;
}
