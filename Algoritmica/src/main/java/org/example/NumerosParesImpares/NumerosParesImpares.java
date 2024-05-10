package org.example.NumerosParesImpares;
import java.util.Scanner;

public class NumerosParesImpares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("LEER NUMERO: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) { // Verifico si el numero es par
            System.out.println("El numero es par. Numeros pares desde " + numero + " hasta 0:");
            for (int i = numero; i >= 0; i -= 2) { // Bucle para los números pares
                System.out.print(i + " ");
            }
        } else { // Si el número es impar
            System.out.println("El numero es impar. Numeros impares desde " + numero + " hasta 1:");
            for (int i = numero; i >= 1; i -= 2) { // Bucle para números impares
                System.out.print(i + " ");
            }
        }
    }
}