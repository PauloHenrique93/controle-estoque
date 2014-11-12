package model;
// Generated 12/11/2014 11:14:00 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cor generated by hbm2java
 */
public class Cor  implements java.io.Serializable {


     private Integer idCor;
     private String nome;
     private Set produtos = new HashSet(0);

    public Cor() {
    }

	
    public Cor(String nome) {
        this.nome = nome;
    }
    public Cor(String nome, Set produtos) {
       this.nome = nome;
       this.produtos = produtos;
    }
   
    public Integer getIdCor() {
        return this.idCor;
    }
    
    public void setIdCor(Integer idCor) {
        this.idCor = idCor;
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




}


