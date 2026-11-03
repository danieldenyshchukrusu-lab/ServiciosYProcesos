package ProgramacionMultiHiloUD2.Actividades.actividad2_1;

public class Main {
    static void main() throws InterruptedException {
        ClaseTIC tic = new ClaseTIC();
        ClaseTAC tac = new ClaseTAC();

        tic.start();
        Thread.sleep(500); //No se visualizan del todoo ordenados, por lo que despues de cada ejecucion, esperaremos unos 500 milisegundos (si lo quitas ya no es ordenado)
        tac.start();



    }
}
