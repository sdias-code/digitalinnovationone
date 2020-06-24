package modulo3;

public class BarraDeCarregamento3 extends Thread{
    @Override
    public void run() {

        try{
            Thread.sleep(1000);
            System.out.println("Rodei BarraDeCarregamento3: ");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
