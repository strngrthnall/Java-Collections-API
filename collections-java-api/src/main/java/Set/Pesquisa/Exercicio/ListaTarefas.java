package main.java.Set.Pesquisa.Exercicio;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
  private Set<Tarefa> tarefaSet;

  public ListaTarefas() {
    this.tarefaSet = new HashSet<>();
  }

  public void adicionarTarefa(String descricao) {
    tarefaSet.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    for(Tarefa t: tarefaSet) {
      if(t.getDescricao().equalsIgnoreCase(descricao)) {
        tarefaSet.remove(t);
        break;
      }
    }
    System.out.println("Tarefa: " + '"' + descricao + '"' + " removida.");
  }

  public void exibirTarefas() {
    System.out.println(tarefaSet);
  }

  public void contarTarefas() {
    int quantidadeTarefas = tarefaSet.size();

    if(quantidadeTarefas == 0) {
      System.out.println("Set de tarefas vazio");
    } else {
      System.out.println("Total:  " +
        quantidadeTarefas + " tarefa(s)."
      );
    }
  }

  public void marcarTarefaConcluida(String descricao) {
    for(Tarefa t: tarefaSet) {
      if(t.getDescricao().equalsIgnoreCase(descricao)) {
        if(t.getConcluido() == false) {
          t.setConcluido(true);
          System.out.println(descricao + " marcada como concluida.");
          break;
        } else {
          System.out.println("Tarefa concluida anteriormente.");
          break;
        }
      }
    }
  }

  public void marcarTarefaPendente(String descricao) {
    for(Tarefa t: tarefaSet) {
      if(t.getDescricao().equalsIgnoreCase(descricao)) {
        if(t.getConcluido() == true) {
          t.setConcluido(false);
          System.out.println(descricao + " marcada como pendente.");
          break;
        } else {
          System.out.println("Tarefa já se encontra pendente.");
          break;
        }
      }
    }
  }

  public void limparListaTarefas() {
    Set<Tarefa> tarefasParaRemover = new HashSet<>();
    for(Tarefa t: tarefaSet) {
      System.out.println(t.getDescricao() + " removido");
      tarefasParaRemover.add(t);
    }
    tarefaSet.removeAll(tarefasParaRemover);
  }



  public static void main(String[] args) {
    ListaTarefas listaTarefas = new ListaTarefas();

    listaTarefas.contarTarefas();

    listaTarefas.adicionarTarefa("Tarefa 1");
    listaTarefas.adicionarTarefa("Tarefa 2");
    listaTarefas.adicionarTarefa("Tarefa 3");
    listaTarefas.adicionarTarefa("Tarefa 4");
    listaTarefas.adicionarTarefa("Tarefa 1");

    listaTarefas.removerTarefa("Tarefa 1");
    
    listaTarefas.exibirTarefas();
    listaTarefas.contarTarefas();

    listaTarefas.marcarTarefaConcluida("Tarefa 4");
    listaTarefas.marcarTarefaConcluida("Tarefa 4");
    listaTarefas.marcarTarefaPendente("Tarefa 4");
    listaTarefas.marcarTarefaPendente("Tarefa 4");

    listaTarefas.limparListaTarefas();

    listaTarefas.exibirTarefas();
  }
}
