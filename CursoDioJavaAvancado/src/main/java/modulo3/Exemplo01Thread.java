package modulo3;

public class Exemplo01Thread {
    public static void main(String[] args) {

        GeradorDePdf iniciarGeradorPdf = new GeradorDePdf();
        BarraDeCarregamento inicarBarraDeCarregamento = new BarraDeCarregamento(iniciarGeradorPdf);

        iniciarGeradorPdf.start();

        inicarBarraDeCarregamento.start();
/*
        Thread thread = new Thread(new BarraDeCarregamento());
        Thread thread1 = new Thread(new BarraDeCarregamento2());
        Thread thread2 = new Thread(new BarraDeCarregamento3());

        thread.start();
        thread1.start();
        thread2.start();

        System.out.println("Nome da Thread: "+thread.getName());
        System.out.println("Nome da Thread: "+thread1.getName());
        System.out.println("Nome da Thread: "+thread2.getName());

*/

    }
}
