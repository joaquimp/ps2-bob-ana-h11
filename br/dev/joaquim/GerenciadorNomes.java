package br.dev.joaquim;

import java.util.*;

public interface GerenciadorNomes {
    public void salvar(Pessoa pessoa);
    public List<Pessoa> obter();
    public void apagar(Pessoa pessoa);
}