package br.com.dio.debbuging;

public class Main {
    public static void main(String[] args) {
        System.out.println("Início do método main.");
        metodo1();
        System.out.println("Fim do método main.");
    }

    private static void metodo1() {
        System.out.println("Início do método1.");
        metodo2();
        System.out.println("Fim do método1.");
    }

    private static void metodo2() {
        System.out.println("Início do médodo2.");
        for(int i = 0; i <= 4; i++)
            System.out.println(i);
        System.out.println("Fim do método2");
    }
}
