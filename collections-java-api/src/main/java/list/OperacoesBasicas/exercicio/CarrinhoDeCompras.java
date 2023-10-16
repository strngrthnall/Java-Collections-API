package main.java.list.OperacoesBasicas.exercicio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  private List<Item> carrinhoDeCompras;

  public CarrinhoDeCompras() {
    this.carrinhoDeCompras = new ArrayList<>();
  }

  public void adcionarItem(String nome, double preco, int quantidade) {
    carrinhoDeCompras.add(new Item(nome, preco, quantidade));
  }

  public void removerItem(String nome) {
    List<Item> itensPraRemover = new ArrayList<>();
    for(Item i: carrinhoDeCompras) {
      if(i.getNome().equalsIgnoreCase(nome)) {
        itensPraRemover.add(i);
      }
    }
    carrinhoDeCompras.removeAll(itensPraRemover);
  }

  public double calcularValorTotal() {
    double precoTotal = 0;
    for(Item i: carrinhoDeCompras) {
      precoTotal += (i.getPreco() * i.getQuantidade());
    }
    return precoTotal;
  }

  public void exibirItens() {
    System.out.println(carrinhoDeCompras);
  }

  public static void main(String[] args) {
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    carrinhoDeCompras.adcionarItem("Item 1", 25.5, 2);
    carrinhoDeCompras.adcionarItem("Item 1", 30, 3);
    carrinhoDeCompras.adcionarItem("Item 2", 32, 1);
    carrinhoDeCompras.exibirItens();
    System.out.println("Valor total: R$" + carrinhoDeCompras.calcularValorTotal());
    carrinhoDeCompras.removerItem("Item 1");
    carrinhoDeCompras.exibirItens();
    System.out.println("Valor total: R$" + carrinhoDeCompras.calcularValorTotal());

  }
}
