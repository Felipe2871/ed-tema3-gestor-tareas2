/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestor_de_tareas;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Gestor_de_tareas {

    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        //System.out.println(""); saludar
        String apellido = sc.nextLine();
        //System.out.println(""); bienvenido 
        
    
        System.out.println("introduce el prinmer numero");
        int numero = sc.nextInt();
        
        
        
        
        
        
        
        
        
      
        double resultado = 0;
        char operacion = 'a';
        mostrarResultado(resultado, operacion);
    }
    
    public static void mostrarResultado(double resultado, char operacion){
        System.out.printf("Resultado de la %c es %d\n",operacion,resultado);
    }
}
