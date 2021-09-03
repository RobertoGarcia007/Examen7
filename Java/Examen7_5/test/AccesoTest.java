/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import examen7_5.Acceso;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yo
 */
public class AccesoTest {
    private Acceso a=new Acceso();
    private int rtn=0;
    public AccesoTest() {
    }
    @Test
    public void acesoap1(){
        
       rtn=a.nivelAcceso(true, false, false);
        assertEquals(3, rtn);
    }
    @Test
    public void acesoap2(){
        rtn=a.nivelAcceso(false, true, false);
        assertEquals(3, rtn);
    }
    @Test
    public void acesoap3(){
        rtn=a.nivelAcceso(false, false, true);
        assertEquals(2, rtn);
    }
    @Test
    public void acesoap1ap2(){
        rtn=a.nivelAcceso(true, true, false);
        assertEquals(1, rtn);
    }
     @Test
    public void acesoap2ap3(){
        rtn=a.nivelAcceso(false, true, true);
        assertEquals(2, rtn);
    }
     @Test
    public void acesoap1ap3(){
        rtn=a.nivelAcceso(true, false, true);
        assertEquals(2, rtn);
    }
     @Test
    public void acesoap1ap2ap3(){
        rtn=a.nivelAcceso(true, true, true);
        assertEquals(1, rtn);
    }
    
}
