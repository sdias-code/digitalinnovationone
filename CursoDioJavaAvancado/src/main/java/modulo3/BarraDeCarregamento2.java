package modulo3;

public class BarraDeCarregamento2 extends Thread{
    @Override
    public void run() {

        try{
            Thread.sleep(2500);
            System.out.println("Rodei BarraDeCarregamento2: ");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
