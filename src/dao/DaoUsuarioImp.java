package dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;




public class DaoUsuarioImp implements DaoUsuario{

    @Override
    public boolean validaLogin(String nome, String senha) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        @SuppressWarnings("rawtypes")
        List lista = session.createQuery("from Usuario where nome = '"+nome+"'and senha = '"+senha+"'").list();
        t.commit();
        session.flush();
        session.close();
        if(lista.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
    
    
}
