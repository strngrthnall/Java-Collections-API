package main.java.Set.Pesquisa.Exercicio;

import java.util.Objects;

public class Tarefa {
  private String descricao;
  private boolean concluido;


  public Tarefa(String descricao) {
    this.descricao = descricao;
  }

  public String getDescricao() {
    return descricao;
  }

  public boolean getConcluido() {
    return concluido;
  }

  public void setConcluido(boolean concluido) {
    this.concluido = concluido;
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj) return true;
    if(!(obj instanceof Tarefa tarefa)) return false;
    return Objects.equals(getDescricao(), tarefa.getDescricao());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getDescricao());
  }


  @Override
  public String toString() {
    return "{ " + getDescricao() + " -" +
      " concluido = " + getConcluido() +
      " }";
  }

}
