/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hellowordl;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class HelloWordl {

  public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("\n===BIENVENIDO A MI PROGRAMA=== \nSUMA------(1) \nRESTA------(2)");
         
        int n;
        System.out.print("\nINGRESE LA OPERACION QUE DESA REALIZAR: ");
        n=entrada.nextInt();
        switch(n){
            case 1: 
            int num1,num2,suma;
            System.out.print("INGRESE EL PRIMER NUMERO: ");
            num1=entrada.nextInt();
            
            System.out.print("INGRESE EL SEGUNDO NUMERO: ");
            num2=entrada.nextInt();
            
            suma=num1+num2;
            System.out.print("\nLA SUMA ES: "+suma);
                    break;
                    
            case 2: 
            int num3,num4,resta;
            System.out.print("INGRESE EL PRIMER NUMERO: ");
            num3=entrada.nextInt();
            
            System.out.print("INGRESE EL SEGUNDO NUMERO: ");
            num4=entrada.nextInt();
            
            resta=num3-num4;
            System.out.print("\nLA RESTA ES: "+resta);
                    break;  
        } 
    }
}
