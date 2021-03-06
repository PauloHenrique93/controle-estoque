package model;
// Generated 21/11/2014 10:23:45 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tamanho generated by hbm2java
 */
public class Tamanho  implements java.io.Serializable {


     private Integer idTamanho;
     private String nome;
     private Set produtos = new HashSet(0);

    public Tamanho() {
    }

	
    public Tamanho(String nome) {
        this.nome = nome;
    }
    public Tamanho(String nome, Set produtos) {
       this.nome = nome;
       this.produtos = produtos;
    }
   
    public Integer getIdTamanho() {
        return this.idTamanho;
    }
    
    public void setIdTamanho(Integer idTamanho) {
        this.idTamanho = idTamanho;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set getProdutos() {
        return this.produtos;
    }
    
    public void setProdutos(Set produtos) {
        this.produtos = produtos;
    }

     @Override
    public String toString(){
        return this.getNome();
    }
    
    

}


