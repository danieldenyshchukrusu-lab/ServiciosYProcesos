package ProcesosUD1.EjerciciosRA1.Ejercicio2;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio2 {

    /* Escribe un programa que solicite un número, lo pase a un proceso hijo y éste
    calcule el doble de dicho número, mostrando el resultado por pantalla. */

    static void main() throws IOException {
        Scanner leer = new Scanner(System.in);

        int numero;
        System.out.println("Introduce un numero para calcular el doble.");
        numero=leer.nextInt();

        ProcessBuilder p = new ProcessBuilder("java","Ejercicio2hijo.java"); //RECUERDA PONER SIEMPRE EL .JAVA DESPUES DEL NOMBRE DEL FICHERO

        File f = new File(".\\src\\main\\java\\ProcesosUD1\\EjerciciosRA1\\Ejercicio2"); //El directorio donde esta el hijo
        p.directory(f);

        p.redirectErrorStream(true); //Esto lo ponemos para saber los errores que no se nos enseñan.
        Process proceso = p.start();

        //Enviamos el numero al Ejercicio2hijo.
        try (PrintWriter pw = new PrintWriter(proceso.getOutputStream())) {
            pw.println(numero);
        }

        //Recibimos lo que ha ejecutado el Ejercicio2hijo
        String resultado = new String(proceso.getInputStream().readAllBytes());
        System.out.println(resultado);

        //PODEMOS HACERLO DE ESTA MANERA TAMBIEN, PERO LA MANERA DE ARRIBA ES MUCHO MAS RAPIDA Y EFICIENTE.
        /* try {
            InputStream is = p.getInputStream();
            int c;
            while ((c = is.read())!=-1){
                System.out.print((char) c);
            }
            is.close();
        }
        catch (Exception e){
            e.printStackTrace();
        } */

    }

}
