package Catas.Comando_Konami;

import java.util.Scanner;

    public class CodigoKonami {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String codigoKonami = "AAAAIDIDBA";
            StringBuilder entradaUsuario = new StringBuilder();

            System.out.println("Introduce la secuencia del Código Konami (Arriba, Abajo, Izquierda, Derecha, B, A):");

            while (scanner.hasNext()) {
                String tecla = scanner.next();
                entradaUsuario.append(tecla);

                // Verificar si la secuencia actual contiene el código Konami
                if (entradaUsuario.toString().contains(codigoKonami)) {
                    System.out.println("¡Código Konami detectado!");
                    break; // Salir del bucle si se detecta el código
                }
            }
            scanner.close();
        }
    }
