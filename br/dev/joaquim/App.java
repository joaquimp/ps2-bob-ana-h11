package br.dev.joaquim;

public class App {
    public static void main(String[] args) {
        GerenciadorNomes gerenciador = new GerenciadorNomesMen();
        Ihm ihm = new Ihm(gerenciador);
        ihm.start();
    }
}
