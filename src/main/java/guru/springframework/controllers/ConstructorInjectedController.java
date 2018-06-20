/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 *
 * @author grune
 */
@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;
    
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }
    
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
