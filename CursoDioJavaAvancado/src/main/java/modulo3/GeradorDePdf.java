package modulo3;

public class GeradorDePdf extends Thread {
    @Override
    public void run() {
        try{
            System.out.println("Iniciando criação do PDF...");
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("PDF criado com sucesso!");
    }
}
