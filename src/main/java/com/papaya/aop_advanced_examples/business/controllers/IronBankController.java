package com.papaya.aop_advanced_examples.business.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/api/")
public class IronBankController {


    @Autowired
    private PredictionService predictionService;

    @GetMapping("/loan/{name}/{amount}")
    public String loan(@PathVariable String name, @PathVariable int amount) {
        if (predictionService.willSurvive(name)) {
            return "loan was allowed";
        }        else {
            return "Rejected you will die soon, or we just don't like you";
        }
    }





/*
    @SneakyThrows
    @PostMapping
    public Person person(@RequestBody Person person, HttpRequest httpRequest){
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(new Person());
        Person person1 = mapper.readValue("body", Person.class);
        return new Person();
    }
*/

    @GetMapping("/hello")
    public String sayHello(@RequestParam("name") String name, HttpServletRequest httpRequest){
        return "Hello "+name;
    }

}
