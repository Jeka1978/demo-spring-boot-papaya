package com.papaya.aop_advanced_examples.business.controllers;

import com.papayastarterexample.demo.FrontendController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@FrontendController
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
