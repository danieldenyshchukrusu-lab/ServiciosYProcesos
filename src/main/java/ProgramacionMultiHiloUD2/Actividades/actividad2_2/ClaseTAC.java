package ProgramacionMultiHiloUD2.Actividades.actividad2_2;

public class ClaseTAC extends Thread {
    public void run() {
        while(true) { //Esto es un bucle infinito
            System.out.println("TAC");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }



}
