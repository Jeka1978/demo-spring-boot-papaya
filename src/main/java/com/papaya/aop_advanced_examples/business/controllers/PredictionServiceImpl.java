package com.papaya.aop_advanced_examples.business.controllers;

import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Profile("WINTER_IS_COMING")
//spring.profiles.active
public class PredictionServiceImpl implements PredictionService {
    @Override
    @Async("myEXS")
    public boolean willSurvive(String name) {
        return !name.toLowerCase().contains("stark");
    }
}
