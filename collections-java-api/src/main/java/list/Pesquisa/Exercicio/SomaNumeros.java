package main.java.list.Pesquisa.Exercicio;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
  private List<Integer> numList;

  public SomaNumeros() {
    this.numList = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    numList.add(numero);
  }

  public int calcularSoma() {
    int somaTotal = 0;

    for(int n: numList) {
      somaTotal += n;
    }

    return somaTotal;
  }

  public int calcularSubtracao() {
    int subTotal = 0;

    for(int n: numList) {
      subTotal -= n;
    }

    return subTotal;
  }

  public int encontraMenorNumero() {
    int menorAtual = calcularSoma();

    for(int n: numList) {
      if(n < menorAtual) {
        menorAtual = n;
      }
    }

    return menorAtual;
  }

  public int encontraMaiorNumero() {
    int maiorAtual = calcularSubtracao();

    for(int n: numList) {
      if(n > maiorAtual) {
        maiorAtual = n;
      }
    }

    return maiorAtual;
  }

  public void exibirNumeros() {
    for(int n: numList) {
      System.out.println(n);
    }
  }

  public static void main(String[] args) {
    SomaNumeros somaNumeros = new SomaNumeros();

    somaNumeros.adicionarNumero(20);
    somaNumeros.adicionarNumero(10);
    somaNumeros.adicionarNumero(-5);
    somaNumeros.adicionarNumero(15);
    somaNumeros.adicionarNumero(30);

    System.out.println(somaNumeros.calcularSoma());
    System.out.println(somaNumeros.encontraMaiorNumero());
    System.out.println(somaNumeros.encontraMenorNumero());
    somaNumeros.exibirNumeros();
  }
}
