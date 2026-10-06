package ProcesosUD1.EjerciciosRA1.Ejercicio3;

public class Aleatorioshijo {

    static void main() {

        int numeroAleatorio = (int) (Math.random() * (10 + 1)); //Numero aleatorio entre 0 y 10.
        //Lo casteamos con un int porque Math.random es double.

        System.out.println(numeroAleatorio);

    }

}
