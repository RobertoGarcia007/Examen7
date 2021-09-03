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
public class Acceso {
   
    public int nivelAcceso(boolean ap1,boolean ap2, boolean ap3){
                if(ap1==true && ap2==true){
                     return 1;
                } else if(ap3==true){
                     return 2;
                }
            return 3;
        }
}

