/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import examen7_5.Aspirante;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yo
 */
public class AspiranteTest {
    
    public AspiranteTest() {
    }
    @Test
    public void aspiranteElegido(){
        boolean sw=false;
        boolean swEsp = true;
        Aspirante as= new Aspirante();
        sw=as.verificar(19);
        assertEquals(swEsp,sw);
    }
    @Test
    public void aspiranteRechazadoMayor(){
        boolean sw=false;
        boolean swEsp = false;
        Aspirante as= new Aspirante();
        sw=as.verificar(50);
        assertEquals(swEsp,sw);
    }
    @Test
    public void aspiranteRechazadoMenor(){
        boolean sw=false;
        boolean swEsp = false;
        Aspirante as= new Aspirante();
        sw=as.verificar(15); 
        assertEquals(swEsp,sw);
    }
    @Test
    public void aspiranteCero(){
        boolean sw=false;
        Aspirante as= new Aspirante();
        try{
        sw=as.verificar(-1);
        }catch(Exception e){
            assertEquals(new RuntimeException("La edad debe ser positiva"),e);
        }
    }
    
}
