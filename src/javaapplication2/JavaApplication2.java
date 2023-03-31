/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese los 2 numeros que quiere sumar");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("la suma de los numeros es: " + (num1+num2));
        
        
    }
    
}
