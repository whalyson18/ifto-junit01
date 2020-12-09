/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whalyson.junit01;

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

        if(a % b != 0){
            return 1;
        }
        
        return -1;
    }
    
    public static boolean isPrimo(int p){
        for (int i = 2; i < p; i++) {
            if (p % i == 0)
                return false;   
        }
        return true;
    }
}
