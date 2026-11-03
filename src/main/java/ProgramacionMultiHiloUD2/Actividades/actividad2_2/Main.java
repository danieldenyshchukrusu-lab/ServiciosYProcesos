package ProgramacionMultiHiloUD2.Actividades.actividad2_2;

import ProgramacionMultiHiloUD2.Actividades.actividad2_1.ClaseTAC;
import ProgramacionMultiHiloUD2.Actividades.actividad2_1.ClaseTIC;

public class Main {
    static void main() throws InterruptedException {
        ProgramacionMultiHiloUD2.Actividades.actividad2_1.ClaseTIC tic = new ClaseTIC();
        ProgramacionMultiHiloUD2.Actividades.actividad2_1.ClaseTAC tac = new ClaseTAC();

        tic.start();
        Thread.sleep(500); //No se visualizan del todoo ordenados, por lo que despues de cada ejecucion, esperaremos unos 500 milisegundos (si lo quitas ya no es ordenado)
        tac.start();



    }
}
