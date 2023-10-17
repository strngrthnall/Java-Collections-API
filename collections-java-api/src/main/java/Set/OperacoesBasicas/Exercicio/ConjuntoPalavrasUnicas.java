package main.java.Set.OperacoesBasicas.Exercicio;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
  private Set<Palavra> palavrasSet;

  public ConjuntoPalavrasUnicas() {
    this.palavrasSet = new HashSet<>();
  }

  public void adicionarPalavra(String palavra) {
    palavrasSet.add(new Palavra(palavra));
  }

  public void removerPalavra(String palavra) {
    Palavra palavraParaRemover = null;

    for(Palavra s: palavrasSet) {
      if(s.getPalavra() == palavra) {
        palavraParaRemover = s;
        break;
      }
    }
    palavrasSet.remove(palavraParaRemover);
  }

  public boolean verificarPalavra(String palavra) {
    boolean estaPresente = true;

    for(Palavra s: palavrasSet) {
      if(s.getPalavra() == palavra) {
        estaPresente = true;
        break;
      } else {
        estaPresente = false;
      }
    }
    return estaPresente;
  }

  public void exibirPalavrasUnicas() {
    System.out.println(palavrasSet);
  }

  public static void main(String[] args) {
    ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

    conjuntoPalavrasUnicas.adicionarPalavra("Olá");
    conjuntoPalavrasUnicas.adicionarPalavra("Olá");
    conjuntoPalavrasUnicas.adicionarPalavra("Oi");
    conjuntoPalavrasUnicas.adicionarPalavra("Xau");

    conjuntoPalavrasUnicas.exibirPalavrasUnicas();
  }
}
