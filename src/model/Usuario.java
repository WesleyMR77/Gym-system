
package model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name="tb_user")

public class Usuario implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String senha;
    
    
}
