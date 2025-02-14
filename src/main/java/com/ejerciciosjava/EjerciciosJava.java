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
    
    
    
    /* 3. Realice una función recursiva que imprima los valores invertidos de un 
    TAD Pila, no es necesario conservar los valores de la misma una vez realizada 
    está función. */
    public static class Pila {
        int valor;
        Pila siguiente;

        public Pila(int valor){
            this.valor = valor;
            this.siguiente = null;
        }
    }
    public static String pilaRecursiva(Pila pila){
        if (pila == null){
            return "";
    } else {
        return pila.valor + " " + pilaRecursiva(pila.siguiente);
    }
}
    
    
    /* 4. Cree una función permita realizar la multiplicación de 2 valores A y 
    B, dónde A sea un factorial de un número cualquiera y B sea la potencia de 
    un número cualquiera elevado a cualquier otro número, por ejemplo: 8! + 4⁷.*/
    public static long factorial(int numero){
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
    public static double potencia(double base, int exponente){
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }
    public static double multiFactorialPotencia(int numeroFactorial, int basePotencia, int exponentePotencia){
        return factorial(numeroFactorial) * potencia(basePotencia, exponentePotencia);
    
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
        
        // 3 --> Impresión recursiva de una pila
        Pila pila = new Pila(5);
        pila.siguiente = new Pila(4);
        pila.siguiente.siguiente = new Pila(3);
        pila.siguiente.siguiente.siguiente = new Pila(2);
        pila.siguiente.siguiente.siguiente.siguiente = new Pila(1);
        System.out.println("====================================================");
        System.out.println("3 --> IMPRESIOIN RECURSIVA DE LA PILA -->: " + pilaRecursiva(pila));
        System.out.println("====================================================");
        
        // 4 --> Multiplicación de factorial y potencia
        double resultadoMultiplicacion = multiFactorialPotencia(5, 2, 3);
        System.out.println("======================================================");
        System.out.println("4 --> MULTIPLICACION DE FACTORIAL Y POTENCIA --> " + resultadoMultiplicacion);
        System.out.println("======================================================");
    }
}
