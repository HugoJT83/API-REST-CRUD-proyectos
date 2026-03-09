package com.practica.crud_apirest.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tareas")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tarea;

    private String titulo;
    private String descripcion;

    @Enumerated(EnumType.STRING)
    private Estado estado;


    private Date fecha_creacion;
    private Date fecha_fin;
    private Date ultima_mod;
    
    @Override
    public String toString(){
        return "Tarea{"+
            "id: " + this.id_tarea +
            ", titulo: "+ this.titulo +
            ", descripcion: "+ this.descripcion +
            ", estado: "+ this.estado +
            ", fecha_creacion: "+this.fecha_creacion +
            ", fecha_fin: " + this.fecha_fin +
            ", ultima_mod: " + this.ultima_mod +
            "}";
    };

    
    enum Estado {
        POR_HACER,
        HECHO
    };
}




