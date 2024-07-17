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
    
    
    
    /* 2. Con un TAD lista circular precargado con nodos que contengan como valor 
    almacenado una palabra , desarrolle una función que permita concatenar todos 
    los valores y agregar un espacio de por medio(" "), retornando esa cadena de 
    texto resultante al final de la operación.*/
    public static class Nodo {
        String valor;
        Nodo siguiente;

        public Nodo(String valor){
            this.valor = valor;
            this.siguiente = null;
        }
    }
    public static String concatenarValores(Nodo cabeza){
        return concatenarValoresR(cabeza, "", cabeza);
    }
    private static String concatenarValoresR(Nodo actual, String resultado, Nodo cabeza){
        if (actual == cabeza && resultado.length() > 0){
            return resultado.trim();
    } else {
        return concatenarValoresR(actual.siguiente, resultado + actual.valor + " ", cabeza);
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
        
        // 2 --> Concatenación de valores en una lista circular
        Nodo nodo1 = new Nodo("CAFE NO DISPONIBLE.");
        Nodo nodo2 = new Nodo("INSTALANDO JAVA...");
        Nodo nodo3 = new Nodo("INSTALACION COMPLETA. VUELVA A INTENTARLO!");
        nodo1.siguiente = nodo2;
        nodo2.siguiente = nodo3;
        nodo3.siguiente = nodo1;
        
        String resultadoConcatenacion = concatenarValores(nodo1);
        System.out.println("==========================================================================================================================================");
        System.out.println("2 --> CONCATENACION DE VALORES EN LA LISTA CIRCULAR -->: " + resultadoConcatenacion);
        System.out.println("==========================================================================================================================================");
        
        
    }
}
