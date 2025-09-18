package br.dev.joaquim;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorNomesMem implements GerenciadorNomes {
    private List<Pessoa> pessoas;
    private long contador;

    public GerenciadorNomesMem() {
        this.pessoas = new ArrayList<>();
        this.contador = 0;
    }

    @Override
    public void salvar(Pessoa pessoa) {
        //TODO: buscar para ver se ja existe e atualizar, senao ...
        pessoa.setId(contador ++);
        pessoas.add(pessoa);
    }

    @Override
    public List<Pessoa> obter() {
       return pessoas;
    }

    @Override
    public void apagar(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }

}
