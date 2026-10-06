package ProcesosUD1.EjerciciosRA1.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    /* Crea una clase Java que calcule cuántos divisores tiene un número que le
    pasaremos por parámetro. El resultado nos los mostrará posteriormente por
    pantalla. */

    static void main() {
        Scanner leer = new Scanner(System.in);

        int numero;
        int contador = 0;

        System.out.println("Introduce un numero y te diremos cuantos divisores tiene");
        numero = leer.nextInt();

        for (int i=1;i<numero;i++) {
            if (numero % i==0) {
                contador++;
            }
        }

        System.out.println("El numero "+numero+" tiene " +contador+ " divisores.");


    }
}
