package boletin17_1;

import java.util.Arrays;
import java.util.Collections;

public class Boletin17_1 {

    public static void main(String[] args) {
        
        Double[] numeros = new Double[5];
        
        for (Double numero: numeros){
            numero = (Double) Math.random()*50+1;
            System.out.println("Numero: " + numero);
        }
        
        System.out.println("Array Ordenado Descendente");
        Arrays.sort(numeros, Collections.reverseOrder());
        
        for (Double numero: numeros){
            System.out.println("Numero: " + numero);
        }
        
    }
    
}
