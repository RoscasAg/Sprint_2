package org.example.CalculoSalario;
import java.util.Scanner;
public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leo las horas trabajadas y la tarifa por hora
        System.out.print("LEER HORASTRABAJADAS: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.print("LEER TARIFA: ");
        double tarifa = scanner.nextDouble();

        double salario = calcularSalario(horasTrabajadas, tarifa);

        System.out.println("El salario del trabajador es: " + salario + " Euros");

        scanner.close();
    }

    public static double calcularSalario(int horas, double tarifa) {
        int horasExtras = 0;
        if (horas > 40) {
            horasExtras = horas - 40;
            horas = 40;
        }

        double pagoNormal = horas * tarifa;
        double pagoExtra = horasExtras * (tarifa * 1.5); // aplico el 50% más por cada hora extra

        return pagoNormal + pagoExtra;
    }
}
