package br.dev.joaquim;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorNomesMen implements GerenciadorNomes {
    private List<String> nomes;

    public GerenciadorNomesMen() {
        this.nomes = new ArrayList<>();
    }

    @Override
    public void adicionarNome(String nome) {
        this.nomes.add(nome);
    }

    @Override
    public List<String> obterNomes() {
        return this.nomes;
    }
}
