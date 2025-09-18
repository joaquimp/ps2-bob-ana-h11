package br.dev.joaquim;

import java.util.*;

// TODO: atualizar para usar a nova interface GerenciadorNomes

public class Ihm {
    private GerenciadorNomes gerenciador;

    public Ihm(GerenciadorNomes gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void start() {
        gerenciador.adicionarNome("Joaquim");
        gerenciador.adicionarNome("Célia");

        List<String> nomes = gerenciador.obterNomes();

        for(int i=0; i<nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}