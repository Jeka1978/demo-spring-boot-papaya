package com.papaya.aop_advanced_examples.business.controllers;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Profile("WINTER_IS_HERE")
public class SeverePredictionService implements PredictionService {
    @Override
    public boolean willSurvive(String name) {
        return name.toLowerCase().contains("lanister");
    }
}
