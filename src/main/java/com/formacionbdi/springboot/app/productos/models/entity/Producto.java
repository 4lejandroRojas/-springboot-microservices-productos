package com.formacionbdi.springboot.app.productos.models.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "productos")
@Getter
@Setter
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precio;
    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;
    @Transient
    private Integer port;
}

