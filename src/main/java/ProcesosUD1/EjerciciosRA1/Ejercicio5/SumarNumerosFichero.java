package ProcesosUD1.EjerciciosRA1.Ejercicio5;

import java.io.*;

public class SumarNumerosFichero {

    /*
    Realizar un programa que permita sumar los datos de un fichero dado
    “numeros.dat” que contiene 1000 números enteros, cada uno de estos
    números se encontrará en una línea diferente. El usuario deberá decidir desde
    qué número hasta qué número debe sumar el programa, por lo que estos dos
    valores se pedirán por teclado. El programa principal mostrará la suma total.
     */

    static void main() throws IOException {

        ProcessBuilder p = new ProcessBuilder("java","SumarNumerosFicheroHijo.java");
        p.directory(new File(".\\ServiciosYProcesos\\src\\main\\java\\ProcesosUD1\\EjerciciosRA1\\Ejercicio5"));

        p.redirectErrorStream(true);
        Process proceso = p.start();

        //Inicializamos el proceso para que haga un fichero .dat con 1000 numeros dentro, 1 en cada linea.
        //Y una vez inicializado, ahora sumaremos numeros que provengan de este mismo archivo.

        try (BufferedReader br = new BufferedReader(new FileReader("\\ServiciosYProcesos\\Numeros.dat"))) {

            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);

                //Tengo que pedir que lea de una linea a otra linea, hazlo mañana, hoy estas muy cansado.

            }

        }

    }

}
