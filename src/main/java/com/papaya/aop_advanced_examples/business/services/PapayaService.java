package com.papaya.aop_advanced_examples.business.services;

import com.papaya.aop_advanced_examples.business.daos.PapayaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class PapayaService {

    @Autowired
    private PapayaDao dao;

    public void  work(){
        System.out.println("working...");
        dao.saveSomeData();
    }
}
