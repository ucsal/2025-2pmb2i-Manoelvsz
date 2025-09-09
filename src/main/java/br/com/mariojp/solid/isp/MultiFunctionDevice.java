package br.com.mariojp.solid.isp;

public class MultiFunctionDevice implements Printer, Scanner {
    @Override
    public void print(String content) {
        System.out.println("Imprimindo: " + content);
    }

    @Override
    public void scan() {
        System.out.println("Escaneando documento...");
    }
}