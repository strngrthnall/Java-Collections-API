package main.java.Set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
  private String nome;
  private long codigo;
  private double preco;
  private int quantidade;


  public Produto(String nome, long codigo, double preco, int quantidade) {
    this.nome = nome;
    this.codigo = codigo;
    this.preco = preco;
    this.quantidade = quantidade;
  }


  public String getNome() {
    return this.nome;
  }

  public long getCodigo() {
    return this.codigo;
  }

  public double getPreco() {
    return this.preco;
  }

  public int getQuantidade() {
    return this.quantidade;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if(!(obj instanceof Produto produto)) return false;
    return Objects.equals(getCodigo(), produto.getCodigo());
  }
  

  @Override
  public int hashCode() {
    return Objects.hash(getCodigo());
  }


  @Override
  public String toString() {
    return "{" +
      " nome='" + getNome() + "'" +
      ", codigo='" + getCodigo() + "'" +
      ", preco='" + getPreco() + "'" +
      ", quantidade='" + getQuantidade() + "'" +
      "}";
  }


  @Override
  public int compareTo(Produto p) {
    // TODO Auto-generated method stub
    return nome.compareToIgnoreCase(p.getNome());
  }

  
}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
      // TODO Auto-generated method stub
      return Double.compare(p1.getPreco(), p2.getPreco());
    }
    
  }
