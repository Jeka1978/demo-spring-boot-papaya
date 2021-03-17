package com.papaya.hiebernate.examples;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Component
@Scope("singleton")
public class IntegerFactory implements FactoryBean<Integer> {


    @Override
    public Integer getObject() throws Exception {
        Random random = new Random();
        return random.nextInt(1000);
    }

    @Override
    public Class<?> getObjectType() {
        return Integer.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
