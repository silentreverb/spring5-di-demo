/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 *
 * @author grune
 */
@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {
    
    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primario";
    }
}
