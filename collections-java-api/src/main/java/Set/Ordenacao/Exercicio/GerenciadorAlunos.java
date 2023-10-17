package main.java.Set.Ordenacao.Exercicio;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
  private Set<Aluno> alunosSet;

  public GerenciadorAlunos() {
    this.alunosSet = new HashSet<>();
  }

  public void adicionarAluno(String nome, long matricula, 
      double media) {
    alunosSet.add(new Aluno(nome, matricula, media));
  }

  public void removerAluno(long matricula) {
    Set<Aluno> alunosParaRemover = new HashSet<>();
    for(Aluno a: alunosSet) {
      if(a.getMatricula() == matricula) {
        alunosParaRemover.add(a);
        break;
      }
    }
    alunosSet.removeAll(alunosParaRemover);
    System.out.println("Aluno removido");
  }

  public Set<Aluno> exibirAlunosPorNome() {
    Set<Aluno> alunoPorNome = new TreeSet<>(alunosSet);
    return alunoPorNome;
  }

  public Set<Aluno>exibirAlunosPorNota() {
    Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
    alunosPorNota.addAll(alunosSet);
    return alunosPorNota;
  }

  public void exibirAlunos() {
    System.out.println(alunosSet);
  }

  private long geraMatricula() {
    Random random = new Random();
    long matricula = random.nextLong();
    while(true) {
      if(matricula > 0) {
        break;
      } else {
        matricula = random.nextLong();
      }
    }
    return matricula;
  }

  public static void main(String[] args) {
    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
    
    long matriculaDuplicada = gerenciadorAlunos.geraMatricula();

    gerenciadorAlunos.adicionarAluno("Marcos", matriculaDuplicada, 7.5);
    gerenciadorAlunos.adicionarAluno("Claudio", gerenciadorAlunos.geraMatricula(), 5.5);
    gerenciadorAlunos.adicionarAluno("Iris", gerenciadorAlunos.geraMatricula(), 8);
    gerenciadorAlunos.adicionarAluno("Silvio", gerenciadorAlunos.geraMatricula(), 4);
    gerenciadorAlunos.adicionarAluno("Ohana", matriculaDuplicada, 5.5);

    gerenciadorAlunos.exibirAlunos();

    gerenciadorAlunos.removerAluno(matriculaDuplicada);

    gerenciadorAlunos.exibirAlunos();


    System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
    System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
  }
}
