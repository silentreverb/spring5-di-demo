/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.services;

/**
 *
 * @author grune
 */
public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO_GURUS = "Hello Gurus!!!!";
    
    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
