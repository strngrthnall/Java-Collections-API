package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  private Map<String, Integer>  agendaContatosMap;


  public AgendaContatos() {
    this.agendaContatosMap = new HashMap<>();
  }

  public void adicionarContato(String nome, Integer telefone) {
    agendaContatosMap.put(nome, telefone);
  }

  public void removerContato(String nome) {
    if(!agendaContatosMap.isEmpty()) {
      agendaContatosMap.remove(nome);
    }
  }

  public void exibirContatos() {
    System.out.println(agendaContatosMap);
  }

  public Integer pesquisaPorNome(String nome) {
    Integer numeroPorNome = null;
    if(!agendaContatosMap.isEmpty()) {
      numeroPorNome = agendaContatosMap.get(nome);
    }
    return numeroPorNome;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.adicionarContato("Camila", 123456556);
    agendaContatos.adicionarContato("Marcos", 123113516);
    agendaContatos.adicionarContato("Samara", 251516596);
    agendaContatos.adicionarContato("Camila", 651651588);
    agendaContatos.adicionarContato("Josivaldo", 123113516);

    agendaContatos.exibirContatos();

    agendaContatos.removerContato("Josivaldo");
    agendaContatos.exibirContatos();

    System.out.println("O numero é : " + agendaContatos.pesquisaPorNome("Marcos"));

  }
}
