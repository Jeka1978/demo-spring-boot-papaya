package com.papaya.aop_advanced_examples.business.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
//@FrontendController //todo make support for it eny result object should be wrapped with result json

public class PersonController {

   /* {
        result: {
            name: "Niko",
                    money: 1000
        }
    }*/
    @GetMapping("/person")
    public Person person(){
        return Person.builder().money(1000).name("Niko").build();
    }
}
