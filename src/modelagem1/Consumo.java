package modelagem1;
// Generated 06/10/2015 23:41:27 by Hibernate Tools 4.3.1



/**
 * Consumo generated by hbm2java
 */
public class Consumo  implements java.io.Serializable {


     private int idconsumo;
     private int idhospedagem;
     private String nomeproduto;
     private String preco;
     private int quantidade;
     private String nome;
     private int dia;
     private  int mes;
     private  int ano;

    public Consumo() {
    }

  
        
          public Consumo( String nome, int idhospedagem, String nomeproduto, String preco, int quantidade, int dia, int mes, int ano) {
     this.idconsumo=idconsumo;
        this.idhospedagem = idhospedagem;
       this.nomeproduto = nomeproduto;
       this.preco = preco;
       this.quantidade = quantidade;
       this.nome = nome;
       this.dia = dia;
       this.mes = mes;
       this.ano = ano;

   
    }

    public int getIdconsumo() {
        return idconsumo;
    }

    public void setIdconsumo(Integer idconsumo) {
        this.idconsumo = idconsumo;
    }

    public int getIdhospedagem() {
        return idhospedagem;
    }

    public void setIdhospedagem(Integer idhospedagem) {
        this.idhospedagem = idhospedagem;
    }

    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
   
}