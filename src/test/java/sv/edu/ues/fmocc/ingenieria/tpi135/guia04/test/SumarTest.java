/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ues.fmocc.ingenieria.tpi135.guia04.test;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ale
 */
public class SumarTest {
    
    @Test
    public void sumarTest(){
        Sumar s = new Sumar();
        int expected = 10;
        assertEquals(expected, s.suma(5, 5));
    }
    
}
