package main.java.Set.Ordenacao.Exercicio;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
  private String nome;
  private long matricula;
  private double nota;


  public Aluno(String nome, long matricula, double nota) {
    this.nome = nome;
    this.matricula = matricula;
    this.nota = nota;
  }

  public long getMatricula() {
    return matricula;
  }

  public String getNome() {
    return nome;
  }

  public double getNota() {
    return nota;
  }


  @Override
  public String toString() {
    return "{" +
      "nome='" + getNome() + "'" +
      ", matricula='" + getMatricula() + "'" +
      ", nota='" + getNota() + "'" +
      "}\n";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if(!(obj instanceof Aluno aluno)) return false;
    return Objects.equals(getMatricula(), aluno.getMatricula());
  }
  

  @Override
  public int hashCode() {
    return Objects.hash(getMatricula());
  }

  @Override
  public int compareTo(Aluno a) {
    return nome.compareToIgnoreCase(a.getNome());
  }

}

class ComparatorPorNota implements Comparator<Aluno> {
  @Override
  public int compare(Aluno a1, Aluno a2) {
    return Double.compare(a1.getNota(), a2.getNota());
  }
}