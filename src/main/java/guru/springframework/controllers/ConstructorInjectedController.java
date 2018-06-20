/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

/**
 *
 * @author grune
 */
public class ConstructorInjectedController {
    private GreetingService greetingService;
    
    public ConstructorInjectedController(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }
    
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
