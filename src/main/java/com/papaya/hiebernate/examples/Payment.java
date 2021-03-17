package com.papaya.hiebernate.examples;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Evgeny Borisov
 */
@Entity(name = "p_enitity")
@Table(name = "PAYMENTS")
public class Payment {
    @Id
    private int id;

    private String productName;

    private long totalPrice;
}
