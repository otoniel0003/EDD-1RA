/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_1_5_pasoparametros;

/**
 *
 * @author Salid
 */
public class EVA_1_5_PASOPARAMETROS {

    public static void main(String[] args) {
        int i = 5;
        System.out.println("valor de i = " + i);
        incrementar(i);
        System.out.println("valor de i despues de incrementar " + i );
        Prueba prueba = new Prueba ();
        System.out.println("valor pureba.y (despues de incrementar)" + prueba.y);
        incrementarObj(prueba);
        System.out.println("" + prueba );
    }
    public static void incrementar (int valor){
        valor++;
    }
       public static void incrementarObj(Prueba objeto){
     objeto.y++;
   }
}
 class Prueba {
     int y  = 5;
 }