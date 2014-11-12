package model;
// Generated 12/11/2014 11:14:00 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Fornecedor generated by hbm2java
 */
public class Fornecedor extends Pessoa implements java.io.Serializable{


     private String cnpj;
     private Pessoa pessoa;

    public Fornecedor() {
        super();
    }

	
    public Fornecedor(String cnpj, Endereco endereco, String nome, String telefone) {
        super(endereco, nome, telefone);
        this.cnpj = cnpj;
    }
   
    public String getCnpj() {
        return this.cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}


