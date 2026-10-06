package ProcesosUD1.EjerciciosRA1.Ejercicio3;

import java.io.File;
import java.io.IOException;

public class Aleatorios {

    /*Ejercicio 3
    Escribe un programa Aleatorios que haga lo siguiente:

    • Cree un proceso hijo que esté encargado de generar números aleatorios.
    Para su creación puede utilizarse cualquier lenguaje de programación,
    generando el ejecutable correspondiente.

    • Este proceso hijo escribirá en su salida estándar un número aleatorio del 0 al
    10 cada vez que reciba una petición de ejecución por parte del padre.
    Solamente crearemos un ejecutable y lo llamaremos correctamente desde
    Java.

    • El proceso padre lee líneas de la entrada estándar y por cada línea que lea
    solicitará al hijo que le envíe un número aleatorio, lo leerá y lo imprimirá en
    pantalla.

    • Cuando el proceso padre reciba la palabra “fin”, finalizará la ejecución del
    hijo y procederá a finalizar su ejecución.*/

    static void main() throws IOException {

        ProcessBuilder p = new ProcessBuilder("java","Aleatorioshijo.java");

        File f = new File(".\\src\\main\\java\\ProcesosUD1\\EjerciciosRA1\\Ejercicio3");

        p.directory(f);
        Process proceso = p.start();

    }
}
