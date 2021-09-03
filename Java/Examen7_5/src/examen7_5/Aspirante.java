/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen7_5;

/**
 *
 * @author yo
 */
public class Aspirante {
    public boolean verificar(int edad){
        boolean sw = false;
        if (edad<18 || edad>40){
            sw=false;
        }else if(edad>18 && edad<40){
            sw=true;
        }else if(edad<0){
            throw new RuntimeException("La edad debe ser positiva");
        }
        
        return sw;
    }
}
