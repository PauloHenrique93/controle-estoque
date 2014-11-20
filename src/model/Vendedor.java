package model;
// Generated 20/11/2014 14:44:36 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vendedor generated by hbm2java
 */
public class Vendedor  extends Pessoafisica {
    
     private double salario;
     private Date dataAdmissao;
     private Date dataDemissao;

    public Vendedor() {
    }

    public Vendedor(Endereco endereco, String nome, String telefone, String cpf, char sexo, Date dataNascimento, double salario, Date dataAdmissao) {
        super(endereco, nome, telefone, cpf, sexo, dataNascimento);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }
   
    public double getSalario() {
        return this.salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Date getDataAdmissao() {
        return this.dataAdmissao;
    }
    
    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    public Date getDataDemissao() {
        return this.dataDemissao;
    }
    
    public void setDataDemissao(Date dataDemissao) {
        this.dataDemissao = dataDemissao;
    }



}


