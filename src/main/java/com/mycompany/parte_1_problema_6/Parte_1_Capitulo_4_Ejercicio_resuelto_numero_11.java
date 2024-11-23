/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parte_1_problema_6;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Samuel Cataño C
 */
public class Parte_1_Capitulo_4_Ejercicio_resuelto_numero_11 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner lector = new Scanner(System.in);
        
        double n1,n2,n3,mayor;
        
        System.out.println("Por favor ingrese el primer número: ");
        n1 = lector.nextDouble();
        System.out.println("Por favor ingrese el segundo número: ");
        n2 = lector.nextDouble();
        System.out.println("Por favor ingrese el tercer número: ");
        n3 = lector.nextDouble();
        
        if (n1>n2&&n1>n3) {
            mayor = n1;
        } else if (n2>n3) {
            mayor = n2;
        } else {mayor = n3;}
        
        System.out.println("El valor mayor entre "+n1+", "+n2+" y "+n3+" es: "+mayor);
    }
}
