package model;


import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name="tb_pagamento")
public class Pagamento implements Serializable{
    @Id
    @GeneratedValue    
    int id;
    double bonus;
    
    @ManyToOne
    @JoinColumn
    private Personal personalp;  
}
