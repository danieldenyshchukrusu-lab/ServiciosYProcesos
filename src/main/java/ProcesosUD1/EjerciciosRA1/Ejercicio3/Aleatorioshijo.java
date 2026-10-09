package ProcesosUD1.EjerciciosRA1.Ejercicio3;

import java.util.Scanner;

public class Aleatorioshijo {

    static void main() {
        Scanner leer = new Scanner(System.in);

        int numeroAleatorio = (int) (Math.random() * (10 + 1));
        System.out.println(numeroAleatorio);

        /* ===== EJERCICIO HECHO DE UNA MEJOR MANERA ===== */

        /* while(leer.hasNextLine()) {
            int numeroAleatorio = (int) (Math.random() * (10 + 1)); //Numero aleatorio entre 0 y 10.
            //Lo casteamos con un int porque Math.random es double.
            System.out.println(numeroAleatorio);
        } */
    }

}
