package main.java.Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  private Set<Contato> contatoSet;

  public AgendaContatos() {
    this.contatoSet = new HashSet<>();
  }

  public void adicionarContato(String nome, int numero) {
    contatoSet.add(new Contato(nome, numero));

  }

  public void exibirContatos() {
    System.out.println(contatoSet);
  }

  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatosPorNome = new HashSet<>();
    for(Contato c: contatoSet) {
      if(c.getNome().startsWith(nome)) {
        contatosPorNome.add(c);
      }
    }
    return contatosPorNome;
  }

  public Contato atualizarNumeroContato(String nome, int novoNumero) {
    Contato contatoAtulizado = null;
    for(Contato c: contatoSet) {
      if(c.getNome().equalsIgnoreCase(nome)) {
        c.setNumero(novoNumero);
        contatoAtulizado = c;
        break;
      }
    }
    return contatoAtulizado;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.exibirContatos();

    agendaContatos.adicionarContato("Marcos", 123456);
    agendaContatos.adicionarContato("Marcos", 2552162);
    agendaContatos.adicionarContato("Marcos Ribeiro", 666268151);
    agendaContatos.adicionarContato("Marcos de Miranda", 2232518);
    agendaContatos.adicionarContato("Claudio Pereira", 3326282);

    agendaContatos.exibirContatos();

    //System.out.println(agendaContatos.pesquisarPorNome("Marcos"));

    System.out.println("Contato atualizado: " 
      + agendaContatos.atualizarNumeroContato("Claudio Pereira", 12345678));

    agendaContatos.exibirContatos();
  }
}
