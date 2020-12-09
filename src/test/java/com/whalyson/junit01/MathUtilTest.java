/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whalyson.junit01;

import static com.whalyson.junit01.MathUtil.mdc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author whalyson
 */
class MathUtilTest {

    @Test
    void testMdcAParP1() {
        final int a = 6;
        final int b = 3;
        final int esperado = b;
        
        final int obtido = MathUtil.mdc(a, b);

        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcAImparP1() {
        final int a = 9;
        final int b = 3;
        final int esperado = b;
        
        final int obtido = MathUtil.mdc(a, b);

        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcParesP2(){
        final int a = 16;
        final int b = 8;
        final int divisor = 4;
        final int obtido = MathUtil.mdc(a, b);
        
        assertTrue(obtido % divisor == 0);
    }
    
    @Test
    void testMdcAPositivoP3(){
        final int a = 15;
        final int b = 0;
        final int esperado = 15;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcANegativoP3(){
        final int a = -30;
        final int b = 0;
        final int esperado = 30;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcMParP4(){
        final int a = 9;
        final int b = 3;
        final int m = 2;
        
//        mdc(a*m, b*m) == m * mdc(a, b)
//        mdc(18, 6) == 2 * mdc(9, 3)
//        6 == 2 * 3

        final int esperado = MathUtil.mdc(a * m, b * m);
        final int obtido = m * MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP5(){
        final int a = 7;
        final int b = 3;
        final int c = 5;
        
        final int esperado = mdc(a * b, c);
        
        final int obtido = mdc(b, c);
        
        //System.out.println("Esperado: " + esperado + " Obtido: " + obtido);

        assertEquals(esperado, obtido);
    }

    @Test
    void testMdcP5Resultado1(){
        final int a = 7;
        final int b = 3;
        final int c = 5;
        
        final int esperado = 1;
        
        final int obtido = mdc(b, c);
        
        //System.out.println("Esperado: " + esperado + " Obtido: " + obtido);

        assertEquals(esperado, obtido);

    }

    @Test
    void testMdcP6(){
        final int a = 8;
        final int b = 2;

        final int esperado = mdc(a, b);
        final int obtido = mdc(b, a);

        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMscP7TudoNegativo(){
        final int a = -12;
        final int b = -6;
        final int esperado = 6;
        final int obtido = mdc(a, b);
        
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP8(){
        final int a = 8;
        final int b = 8;

        final int esperado = a;
        final int obtido = mdc(a, b);

        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP9(){
        final int a = 12;
        final int b = 6;
        final int c = 2;

        final int esperado = 2;
        final int obtido1 = mdc(a, mdc(b, c));
        final int obtido2 = mdc(mdc(a, b), c);
        //System.out.println("Esperado: " + obtido1 + " Obtido: " + obtido2);
        assertEquals(obtido1, obtido2);
    }
    
    @Test
    void testMdcP12(){
        final int p = 11;
        final int a = 6;

        final int esperado = 1;
        final int obtido = mdc(p, a);
        //System.out.println("Esperado: " + esperado + " Obtido: " + obtido);
        assertEquals(esperado, obtido);
    }
}
