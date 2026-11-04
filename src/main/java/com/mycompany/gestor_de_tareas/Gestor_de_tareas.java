/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestor_de_tareas;

/**
 *
 * @author Usuario
 */
public class Gestor_de_tareas {

    public static void main(String[] args) {
        double resultado = 0;
        char operacion = 'a';
        mostrarResultado(resultado, operacion);
    }
    
    public static void mostrarResultado(double resultado, char operacion){
        System.out.printf("Resultado de la %c es %d\n",operacion,resultado);
    }
}
