package TrianguloT;
import java.util.Scanner;
public class Triangulo {
    private static Scanner teclado;
    public static void main(String[] args) {
        /* Se pide al usuario que introduzca los tres lados de un triángulo
         * para determinar el tipo de triángulo y mostrar su perímetro.
         * Autor: Hugo Sanchez Alpañez
         */
        double lado1, lado2, lado3;
        String tipo= "";
        teclado = new Scanner(System.in);
        System.out.println("Introduce el primer lado del triángulo:");
        lado1 = teclado.nextDouble();
        System.out.println("Introduce el segundo lado del triángulo:");
        lado2 = teclado.nextInt();
        System.out.println("Introduce el tercer lado del triángulo:");
        lado3 = teclado.nextFloat();
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Los lados de un triángulo deben ser positivos.");
        } else if (lado1 == lado2 && lado2 == lado3) {
            tipo="equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            tipo="isósceles";
        } else {
            tipo="escaleno";
        }
        double perimetro = lado1 + lado2 +lado3;
        System.out.println("El triángulo es "+ tipo + " y su perímetro es: " + perimetro);
        teclado.close();
    }
}
