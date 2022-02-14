package model;

import java.io.Serializable;
import java.util.List;
import lombok.*;
import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name="tb_cliente_per")
public class ClientePer implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private double peso;
    private double altura;
    private String genero;
    private int idade;
    private String telefone;
    private double mensalidade;
    
    @ManyToOne
    @JoinColumn
    private Personal personal;  
    
//    @ManyToOne
//    @JoinColumn
//    private Pagamento pagamento;      
}
