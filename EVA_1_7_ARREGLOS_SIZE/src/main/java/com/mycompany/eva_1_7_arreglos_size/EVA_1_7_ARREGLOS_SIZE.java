/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_1_7_arreglos_size;

/**
 *
 * @author Salid
 */
public class EVA_1_7_ARREGLOS_SIZE {

    public static void main(String[] args) {
        int[] original = new int[10];
        for(int i = 0;) i< original.length; i++){
            original[i] = (int)(Math.random() * 100);
    }
        for (int i = 0; i < original.length; i++){
            System.out.println("{" + original][i] + "}");
        }
        System.out.println("");
        original = new int[5];
        System.out.println(original);
        for (int i = 0; i < original.length; i++){
            System.out.println("{" + original [i] + "}");
        }
    }
}
