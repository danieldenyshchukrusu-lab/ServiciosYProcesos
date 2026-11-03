package ProgramacionMultiHiloUD2.Actividades.actividad2_2;

public class ClaseTIC extends Thread {
    public void run() {
        while(true) { //esto es un bucle infinito
            System.out.println("TIC");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
