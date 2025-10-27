package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        //Pedir numeros
        Scanner sc = new Scanner(System.in);
        int num_1;
        int num_2;
        int num_3;
        System.out.println("Ingrese el primer numero ");
        num_1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero ");
        num_2=sc.nextInt();
        System.out.println("Ahora voy a decirte la suma, resta, producto y division de esos dos numeros ");
        //calculo
        System.out.println("/SUMA/");
        System.out.println("" + (num_1+num_2));
        System.out.println("/RESTA/");
        System.out.println("" + (num_1-num_2));
        System.out.println("/PRODUCTO/");
        System.out.println("" + (num_1*num_2));
        System.out.println("/DIVISION/");
        try {
            System.out.println("" + (num_1/num_2));
        } catch (ArithmeticException e) {
            System.out.println("Division por zero no posible");
        }
    }
}
