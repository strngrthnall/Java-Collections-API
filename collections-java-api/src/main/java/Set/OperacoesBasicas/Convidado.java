package main.java.Set.OperacoesBasicas;
import java.util.Objects;


public class Convidado {
  private String nome;
  private int codigoConvite;


  public Convidado(String nome, int codigoConvite) {
    this.nome = nome;
    this.codigoConvite = codigoConvite;
  }



  public String getNome() {
    return this.nome;
  }

  public int getCodigoConvite() {
    return codigoConvite;
  }


  @Override
  public String toString() {
    return "{" +
      " nome='" + getNome() + "'" +
      ", codigoConvite='" + getCodigoConvite() + "'" +
      "}";
  }

  
  @Override
  public boolean equals(Object obj) {
    if(this == obj) return true;
    if(!(obj instanceof Convidado convidado)) return false;
    return getCodigoConvite() == convidado.getCodigoConvite();

    
  }

  @Override
  public int hashCode() {
    // TODO Auto-generated method stub
    return Objects.hash(getCodigoConvite());
  }

}