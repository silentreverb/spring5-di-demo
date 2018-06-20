/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 *
 * @author grune
 */
@Controller
public class MyController {

    private GreetingService greetingService;
    
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    public String hello() {
        System.out.println("Hello!!! ");
        
        return greetingService.sayGreeting();
    }
    
}
