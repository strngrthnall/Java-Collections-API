package main.java.map.Ordenaco;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
  private Map<LocalDate, Evento> eventoMap;

  public AgendaEventos() {
    this.eventoMap = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nome, String atracao) {
    eventoMap.put(data, new Evento(nome, atracao));
  }

  public void exibirAgenda() {
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
    System.out.println(eventosTreeMap);
  }

  public void obterProximoEvento() {
    LocalDate dataAtual = LocalDate.now();
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);

    for(Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()) {
      if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
        System.out.println(entry.getValue() + " - " + entry.getKey());
        break;
      }
    }

  }

  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY, 15), "Evento 1", "Atracao 1");
    agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 10), "Evento 2", "Atracao 2");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 17), "Evento 3", "Atracao 3");
    agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 26), "Evento 4", "Atracao 4");

    agendaEventos.exibirAgenda();
    agendaEventos.obterProximoEvento();
  }

}
