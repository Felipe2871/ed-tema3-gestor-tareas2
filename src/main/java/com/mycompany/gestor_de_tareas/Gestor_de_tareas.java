package com.mycompany.gestor_de_tareas;

import java.util.Scanner;

public class Gestor_de_tareas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double resultado = 0;
        
        int num1 = tryInt(sc, "Ingrese el primer numero");
        int num2 = tryInt(sc, "Ingrese el segundo numero");
        char operacion = comprobarOperacion(sc, "Introduce la operacion (+ - * /)");

        resultado = calculos(num1, num2, operacion);
        mostrarResultado(resultado, operacion, num1, num2);

        sc.close();
    }

    public static void mostrarResultado(double resultado, char operacion, int num1, int num2) {
        System.out.printf("Resultado de %d %c %d es %.2f%n",num1, operacion, num2, resultado);
    }

    public static double calculos(int num1, int num2, char operador) {
        double resultado = 0;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = (double) num1 / num2;
                }
                break;
        }
        return resultado;
    }

    public static int tryInt(Scanner sc, String txt) {
        boolean valido = false;
        int num = 0;
        while (!valido) {
            try {
                System.out.println(txt);
                num = Integer.parseInt(sc.nextLine().trim());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: solo se permiten numeros");
            }
        }
        return num;
    }
    
    public static char comprobarOperacion(Scanner sc, String txt){
        char operacion = ' ';
        do {
            System.out.println(txt);
            operacion = sc.nextLine().charAt(0);
        } while (operacion != '+' && operacion != '-' && operacion != '*' && operacion != '/');
        return operacion;
    }
}