package main.java.Set.OperacoesBasicas.Exercicio;

import java.util.Objects;

public class Palavra {
  private String palavra;


  public Palavra(String palavra) {
    this.palavra = palavra;
  }

  public String getPalavra() {
    return palavra;
  }


  @Override
  public String toString() {
    return "{" +
      " palavra='" + getPalavra() + "'" +
      "}";
  }

  

  @Override
  public boolean equals(Object obj) {
    if(this == obj) return true;
    if(!(obj instanceof Palavra palavra)) return false;
    return getPalavra() == palavra.getPalavra();
  }

    @Override
  public int hashCode() {
    // TODO Auto-generated method stub
    return Objects.hash(getPalavra());
  }
}
