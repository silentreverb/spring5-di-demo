/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 *
 * @author grune
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    
    @Override
    public String sayGreeting() {
        return "Hello - I was injected via the constructor!!!";
    }
}
