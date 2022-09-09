package com.empresa.empresa2020.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Employeee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Genera ID automatico
    private long id;

    @Column(unique = true)
    private String email;

    @ManyToOne
    private Enterprise enterprise;
    private Date updateAt;
    private Date createdAt;




}
