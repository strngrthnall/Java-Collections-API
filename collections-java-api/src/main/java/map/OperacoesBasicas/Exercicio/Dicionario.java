package main.java.map.OperacoesBasicas.Exercicio;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
  private Map<String, String> dicionarioMap;


  public Dicionario() {
    this.dicionarioMap = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, String definicao) {
    dicionarioMap.put(palavra, definicao);
  }

  public void removerPalavra(String nome) {
    if(!dicionarioMap.isEmpty()) {
      dicionarioMap.remove(nome);
    }
  }

  public void exbirPalavras() {
    System.out.println(dicionarioMap);
  }

  public String pesquisarPorPalavra(String palavra) {
    String palavraPesquisada = null;
    if(!dicionarioMap.isEmpty()) {
      palavraPesquisada = dicionarioMap.get(palavra);
    }
    return palavraPesquisada;
  }

  public static void main(String[] args) {
    Dicionario dicionario = new Dicionario();

    dicionario.adicionarPalavra("Solidão", "'É meu pior castigo'");
    dicionario.adicionarPalavra("null", "Sem valor");
    
    dicionario.exbirPalavras();

    dicionario.removerPalavra("null");

    dicionario.exbirPalavras();

    dicionario.pesquisarPorPalavra("Solidão");

  }
}
