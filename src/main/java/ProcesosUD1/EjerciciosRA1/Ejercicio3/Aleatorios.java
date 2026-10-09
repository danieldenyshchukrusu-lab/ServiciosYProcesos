package ProcesosUD1.EjerciciosRA1.Ejercicio3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

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
        Scanner leer = new Scanner(System.in);

        /* |ASI SE HARIA SI NOS PIDEN UN EJECUTABLE| */
        ProcessBuilder p = new ProcessBuilder("CMD", "/c","Aleatorioshijo.bat"); //Aqui despues de hacer esto, tienes que hacer dentro de tu proyecto ServiciosYProcesos el fichero .bat
                                                                                            //Y poner dentro "java" "(ruta donde esta el archivo) (abre tu fichero .bat para verlo)"

        /* |ASI SE HARIA SI NO NOS PIDIERA UN EJECUTABLE|
        ProcessBuilder p = new ProcessBuilder("java", "Aleatorioshijo.java");
        p.directory(new File(".\\src\\main\\java\\ProcesosUD1\\EjerciciosRA1\\Ejercicio3")); */

        System.out.println("Introduce un texto");
        String texto = leer.nextLine();

        while (!texto.equals("fin")) {

            Process proceso = p.start();

            String resultado = new String(proceso.getInputStream().readAllBytes()).trim();
            System.out.println("Número aleatorio: " + resultado);

            System.out.println("Introduce un texto");
            texto = leer.nextLine();
        }

        System.out.println("El programa ha finalizado con éxito");

        /* ===== EJERCICIO HECHO DE UNA "MEJOR" MANERA ===== */

        /* ProcessBuilder p = new ProcessBuilder("java", "Aleatorioshijo.java");

        File f = new File(".\\src\\main\\java\\ProcesosUD1\\EjerciciosRA1\\Ejercicio3");

        p.directory(f);
        Process proceso = p.start();

        PrintWriter haciaHijo = new PrintWriter(proceso.getOutputStream(), true);  //Hacemos el true autoflush, para que el hijo lo reciba directamente.
                                                                                            //En el EJERCICIO 2 no tuvimos que poner nada parecido a un flush porque lo hicimos con el try-with-resources, que hace .close y .flush a la vez.
        Scanner delHijo = new Scanner(proceso.getInputStream());
        //El scanner no lee solamente desde el teclado, si no que lee desde cualquier fuente de datos
        //y el constructor de este nos permite poner un getInputStream.
        //No hacemos readAllBytes porque este funciona cuando el flujo se cierra (.close), pero este nunca se cierra, de hecho al final nosotros hacemos un destroy para terminarlo directamente.

        String texto = "";
        System.out.println("Introduce un texto");
        texto = leer.nextLine();

        while (!texto.equals("fin")) {
            haciaHijo.println(texto);
            System.out.println(delHijo.nextLine());

            System.out.println("Introduce un texto");
            texto = leer.nextLine();
        }

        proceso.destroy();
        System.out.println("El programa ha finalizado con éxito"); */

    }
}
