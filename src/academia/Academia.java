package academia;

import dao.DaoObjectImp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ClientePer;
import model.Usuario;
import view.Login;

public class Academia {
    
    public static void main(String[] args) {        
        List<Usuario> usuarios = new ArrayList<Usuario>();
        DaoObjectImp  dao = new DaoObjectImp();
        Usuario u = new Usuario();
        
        usuarios = (List <Usuario>) (Object)dao.getBD("Usuario");
        if (usuarios.isEmpty()) {;
            JOptionPane.showMessageDialog(null, "usuario padrão criado \nusuario: aluno\nsenha: aluno");
            u.setNome("aluno");
            u.setSenha("aluno");
            dao.salvar(u);
        }         
        Login l = new Login();
        l.setVisible(true);
    }
    
}
