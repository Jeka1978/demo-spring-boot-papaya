package com.papaya.aop_advanced_examples.business.daos;

/**
 * @author Evgeny Borisov
 */
public class MsqlPostgresException extends RuntimeException {
    public MsqlPostgresException(String message) {
        super(message);
    }
}
