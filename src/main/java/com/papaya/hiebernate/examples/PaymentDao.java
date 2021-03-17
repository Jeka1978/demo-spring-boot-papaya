package com.papaya.hiebernate.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Repository
public class PaymentDao {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Payment> findAllPaymentsAbovePrice(Long price) {
       /* return entityManager.createNativeQuery("select * from person where totalPrice > :price")
                .setParameter("price", price)
                .getResultList();*/
        return entityManager.createQuery("from p_entity where totalPrice > :price")
                .setParameter("price", price)
                .getResultList();

    }


    public void save(Payment payment) {
        entityManager.persist(payment);
    }


}
