package model;
// Generated 20/11/2014 14:44:36 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Estampa generated by hbm2java
 */
public class Estampa  implements java.io.Serializable {


     private Integer idEstampa;
     private String nome;
     private Set produtos = new HashSet(0);

    public Estampa() {
    }

	
    public Estampa(String nome) {
        this.nome = nome;
    }
    public Estampa(String nome, Set produtos) {
       this.nome = nome;
       this.produtos = produtos;
    }
   
    public Integer getIdEstampa() {
        return this.idEstampa;
    }
    
    public void setIdEstampa(Integer idEstampa) {
        this.idEstampa = idEstampa;
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


