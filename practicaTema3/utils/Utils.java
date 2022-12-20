package utils;

import java.util.Scanner;

public class Utils {
    public static void pulsaUnaTecla(){
        System.out.println("Pulsa una tecla para continuar...");
        new Scanner(System.in).nextLine();
        for (int i = 0; i < 40; i++) { //Limpieza
            System.out.println("");

        }
    }

    public static void limpiarPantalla(){
        for (int i = 0; i < 40; i++) { //Limpieza
            System.out.println("");

        }
    }

    public static void iniciarSesion(){
        System.out.print("Iniciando sesión");
        for (int i = 0; i < 4; i++) { //Animación
            System.out.print(".");
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        for (int i = 0; i < 40; i++) { //Limpieza
            System.out.println("");

        }
    }

    public static void cerrarSesion(){
        System.out.print("Cerrando sesión");
        for (int i = 0; i < 4; i++) { //Animación
            System.out.print(".");
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        for (int i = 0; i < 40; i++) { //Limpieza
            System.out.println("");

        }
    }
    public static void volverMenuAnterior(){
        System.out.print("Volviendo al menú anterior");
        for (int i = 0; i < 4; i++) { //Animación
            System.out.print(".");
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        for (int i = 0; i < 40; i++) { //Limpieza
            System.out.println("");

        }
    }

    public static void apagarApp(){
        System.out.println();
        System.out.print("Apagando sistema");
        for (int i = 0; i < 4; i++) { //Animación
            System.out.print(".");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        for (int i = 0; i < 40; i++) { //Limpieza
            System.out.println("");

        }
    }
}
