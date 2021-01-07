/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whalyson.junit01;

import java.util.Objects;

/**
 *
 * @author whalyson
 */
public class MathUtil {
    public static int mdc(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;
        
        
        if(b > 0 && a % b == 0){
            return b;
        }
        
        if(b == 0){
            return Math.abs(a);
        }
        
        if(isPrimo(a)){
            return 1;
        }

//        if(a % b != 0){
//            return 1;
//        }
//        
//        return -1;

        return mdc(a - b, b);
    }
    
    public static int mdc(int ...valores){
        Objects.requireNonNull(valores, "O parametro valores nao pode ser nulo para calcular o MDC");
        if(valores.length == 0){
            throw new IllegalArgumentException("É preciso indicar ao menos um valor pra calcular o MDC!!!");
        }
        int a = valores[0];
        for (int b : valores) {
            a = mdc(a, b);
        }
        return a;
    }
    
    public static boolean isPrimo(int p){
        for (int i = 2; i < p; i++) {
            if (p % i == 0)
                return false;   
        }
        return true;
    }
}
