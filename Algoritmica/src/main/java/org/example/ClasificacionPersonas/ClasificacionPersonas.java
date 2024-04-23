package org.example.ClasificacionPersonas;
import java.util.Scanner;

class Persona {
    String sexo;
    int edad;

    public Persona(String sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }
}

public class ClasificacionPersonas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona[] personas = new Persona[50];
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;
        int hombresMayores = 0;
        int mujeresMenores = 0;
        int totalMujeres = 0;

        System.out.println("LEER PERSONAS");
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingrese sexo (M/F) y edad de la persona " + (i + 1) + ":");
            String sexo = scanner.next();
            int edad = scanner.nextInt();
            personas[i] = new Persona(sexo, edad);

            if (edad >= 18) {
                mayoresDeEdad++;
                if (sexo.equals("M")) {
                    hombresMayores++;
                }
            } else {
                menoresDeEdad++;
                if (sexo.equals("F")) {
                    mujeresMenores++;
                }
            }

            if (sexo.equals("F")) {
                totalMujeres++;
            }
        }

        double porcentajeMayores = (mayoresDeEdad * 100.0) / personas.length;
        double porcentajeMujeres = (totalMujeres * 100.0) / personas.length;

        System.out.println("La cantidad de personas mayores de edad: " + mayoresDeEdad);
        System.out.println("La cantidad de personas menores de edad: " + menoresDeEdad);
        System.out.println("La cantidad de personas masculinas mayores de edad: " + hombresMayores);
        System.out.println("La cantidad de personas femeninas menores de edad: " + mujeresMenores);
        System.out.println("El porcentaje de personas mayores de edad respecto al total: " + porcentajeMayores + "%");
        System.out.println("El porcentaje  de mujeres respecto al total de personas: " + porcentajeMujeres + "%");
    }
}
