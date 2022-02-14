
package dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class DaoObjectImp implements DaoObject{
    
    @Override
    public void salvar(Object o) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        session.save(o);
        t.commit();
        session.flush();
        session.close();
    } 

    @Override
    public void alterar(Object o) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        session.update(o);
        t.commit();
        session.flush();
        session.close();
    } 

    @Override
    public void excluir(Object o) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        session.delete(o);
        t.commit();
        session.flush();
        session.close();
    } 

    @Override
    @SuppressWarnings("unchecked")
    public List<Object> getBD(String nameclass) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        @SuppressWarnings("rawtypes")
        List lista = session.createQuery("from "+ nameclass).list();
        t.commit();
        session.flush();
        session.close();
        return lista;
    }
 
}
