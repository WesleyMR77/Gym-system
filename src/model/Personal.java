
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="tb_personal")
public class Personal implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private double salario;
    
    @OneToMany(mappedBy = "personal")
    List<ClientePer> lista;

   
  
    @OneToMany(mappedBy = "personalp")
    List<Pagamento> listap;    
    
}
