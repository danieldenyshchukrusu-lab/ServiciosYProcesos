package ProcesosUD1.EjerciciosRA1.Ejercicio5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SumarNumerosFicheroHijo {

    static void main() {

        System.out.println("Fichero creado correctamente");

        String rutaArchivo = new String(".\\ServiciosYProcesos\\Numeros.dat");

        File f = new File(rutaArchivo);

        try (PrintWriter pr = new PrintWriter(new FileWriter(f))) { //El printwriter simplemente lo utilizamos para tener mejores metodos que el FileWriter, que es muy anticuado.

            for (int i=0;i<1000;i++) {
                pr.println((int) (Math.random() * 10) + 1);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
