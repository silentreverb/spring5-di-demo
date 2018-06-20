/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author grune
 */
@Controller
public class PropertyInjectedController {
    
    @Autowired
    public GreetingServiceImpl greetingService;
    
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
