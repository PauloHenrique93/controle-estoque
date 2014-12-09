/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Produto;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Matheus Claudino
 */
public class daoProduto {

    public void insert(Produto produto) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.save(produto);

            sessao.getTransaction().commit();
        } catch (HibernateException he) {
            sessao.getTransaction().rollback();
        } finally {
            if (sessao != null) {
                sessao.close();
            }
        }
    }

    public void update(Produto produto) {

        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.update(produto);

            sessao.getTransaction().commit();
        } catch (HibernateException he) {
            sessao.getTransaction().rollback();
        } finally {
            if (sessao != null) {
                sessao.close();
            }
        }
    }

    public void delete(Produto produto) {

        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.delete(produto);

            sessao.getTransaction().commit();
        } catch (HibernateException he) {
            sessao.getTransaction().rollback();
        } finally {
            if (sessao != null) {
                sessao.close();
            }
        }
    }

    public List getProduto(int id) {
        Session sessao = null;

        try {
            sessao = dao.HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
 
            Produto produto = (Produto) sessao.get(Produto.class, new Integer(id));
            
            Criteria cons = sessao.createCriteria(Produto.class);
            cons.setFetchMode("fornecedor", FetchMode.JOIN);
            cons.setFetchMode("categoria", FetchMode.JOIN);
            cons.setFetchMode("cor", FetchMode.JOIN);
            cons.setFetchMode("estampa", FetchMode.JOIN);
            cons.setFetchMode("tamanho", FetchMode.JOIN);
            
            cons.add(Restrictions.like("codigo", id));
            cons.addOrder(Order.asc("codigo"));
            
            List<Produto> res = cons.list();
            
            sessao.getTransaction().commit();
            sessao.close();
            return res;

        } catch (HibernateException he) {
            System.out.println("Erro de inserção do PRODUTO : " + he.getMessage());
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            System.out.println("Erro de inserção do PRODUTO : " + he.getMessage());
            return null;
        }
    }

    public List getNome(String nome) {
        Session sessao = null;
        try {
            sessao = dao.HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            //HQL
            //List<Cliente> res = sessao.createQuery("from Cliente cli JOIN FETCH cli.cidade ").list();
            // CRITERIA
            Criteria cons = sessao.createCriteria(Produto.class);
            cons.setFetchMode("fornecedor", FetchMode.JOIN);
            cons.setFetchMode("categoria", FetchMode.JOIN);
            cons.setFetchMode("cor", FetchMode.JOIN);
            cons.setFetchMode("estampa", FetchMode.JOIN);
            cons.setFetchMode("tamanho", FetchMode.JOIN);

            cons.add(Restrictions.like("nome", nome + "%"));

            cons.addOrder(Order.asc("nome"));

            List<Produto> res = cons.list();

            sessao.getTransaction().commit();
            sessao.close();
            return res;
        } catch (HibernateException he) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            System.out.println("Erro ao listar os PRODUTOS: " + he.getMessage());
            return null;
        }
    }
}
