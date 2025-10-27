package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese la edad: ");
        edad = sc.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
            }
        else {
            System.out.println("Eres menor de edad");
        }
    }
}
