/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ejerciciosjava;

/**
 *
 * @author joseg
 */
public class EjerciciosJava {
    
    /* 1. Demuestre que es posible crear una función recursiva que permita sumar 
    todos los valores un arreglo desde su último índice hasta el primero, retornando 
    al final ese resultado de la suma.*/
    public static int sumaRecursiva(int[] arreglo, int indice){
        if (indice < 0){
            return 0;
        } else {
            return arreglo[indice] + sumaRecursiva(arreglo, indice - 1);
        }
    }
    
    
    
   
    
    
    
    // MAIN
    public static void main(String[] args){
        
        // 1 --> Suma recursiva de un arreglo
        int[] arreglo = {1, 2, 3, 4, 5};
        int resultadoSuma = sumaRecursiva(arreglo, arreglo.length - 1);
        System.out.println("==========================================");
        System.out.println("1 --> SUMA RECURSIVA DE UN ARREGLO -->: " + resultadoSuma);
        System.out.println("==========================================");
        
        
    }
}
