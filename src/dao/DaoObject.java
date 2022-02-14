
package dao;

import java.util.List;

public interface DaoObject {
    public void salvar(Object o);
    public void alterar(Object o);
    public void excluir(Object o);
    public List<Object> getBD(String nameclass);  
    
}
