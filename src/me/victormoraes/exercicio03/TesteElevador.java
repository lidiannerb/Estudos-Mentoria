package me.victormoraes.exercicio03;

public class TesteElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();
        elevador.inicializa(3, 4);

        elevador.entrar();
        elevador.entrar();
        elevador.entrar();
        elevador.sair();
        elevador.sair();
        elevador.sair();
        elevador.sair();
        System.out.println("Número de pessoas no elevador: " + elevador.getCapacidadeAtual());

        System.out.println("Você está no andar nº " + elevador.getAndarAtual());
        elevador.subir();
        elevador.subir();
        System.out.println("Você está no andar nº " + elevador.getAndarAtual());
        elevador.subir();
        System.out.println("Você está no andar nº " + elevador.getAndarAtual());
        elevador.descer();
        System.out.println("Você está no andar nº " + elevador.getAndarAtual());
        elevador.subir();
        elevador.subir();
        System.out.println("Você está no andar nº " + elevador.getAndarAtual());
        elevador.subir();
        elevador.descer();
        elevador.descer();
        elevador.descer();
        elevador.descer();
        System.out.println("Você está no andar nº " + elevador.getAndarAtual());
        elevador.descer();
        System.out.println("Você está no andar nº " + elevador.getAndarAtual());
    }
}
