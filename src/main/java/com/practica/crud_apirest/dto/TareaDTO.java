package com.practica.crud_apirest.dto;

import java.time.LocalDateTime;

import com.practica.crud_apirest.entity.Estado;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class TareaDTO {


    private Long id_tarea;

    @NotBlank(message = "el titulo es obligatorio")
    @Size(min = 5, message = "el titulo tiene que tener más de 5 caracteres")
    @Size(max = 45, message = "el titulo no puede tener más de 45 caracteres")
    private String titulo;

    @NotBlank(message = "la descripcion es obligatoria")
    @Size(min = 5,max = 200, message = "la descripcion no puede tener más de 200 caracteres")
    private String descripcion;

    @NotNull(message = "el estado es obligatorio")
    private Estado estado;

    @FutureOrPresent(message = "la fecha tiene que ser de hoy en adelante.")
    private LocalDateTime fecha_creacion;

    @FutureOrPresent(message = "la fecha tiene que ser de hoy en adelante.")
    private LocalDateTime fecha_fin;

    @FutureOrPresent(message = "la fecha tiene que ser de hoy en adelante.")
    private LocalDateTime ultima_mod;

    
    public TareaDTO() {
    }

    public TareaDTO(Long id_tarea, String titulo, String descripcion, Estado estado, LocalDateTime fecha_creacion,
            LocalDateTime fecha_fin, LocalDateTime ultima_mod) {
        this.id_tarea = id_tarea;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fecha_creacion = fecha_creacion;
        this.fecha_fin = fecha_fin;
        this.ultima_mod = ultima_mod;
    }


    public Long getId_tarea() {
        return id_tarea;
    }


    public void setId_tarea(Long id_tarea) {
        this.id_tarea = id_tarea;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public Estado getEstado() {
        return estado;
    }


    public void setEstado(Estado estado) {
        this.estado = estado;
    }


    public LocalDateTime getFecha_creacion() {
        return fecha_creacion;
    }


    public void setFecha_creacion(LocalDateTime fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }


    public LocalDateTime getFecha_fin() {
        return fecha_fin;
    }


    public void setFecha_fin(LocalDateTime fecha_fin) {
        this.fecha_fin = fecha_fin;
    }


    public LocalDateTime getUltima_mod() {
        return ultima_mod;
    }


    public void setUltima_mod(LocalDateTime ultima_mod) {
        this.ultima_mod = ultima_mod;
    }


    @Override
    public String toString() {
        return "TareaDTO [id_tarea=" + id_tarea + ", titulo=" + titulo + ", descripcion=" + descripcion + ", estado="
                + estado + ", fecha_creacion=" + fecha_creacion + ", fecha_fin=" + fecha_fin + ", ultima_mod="
                + ultima_mod + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_tarea == null) ? 0 : id_tarea.hashCode());
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        result = prime * result + ((fecha_creacion == null) ? 0 : fecha_creacion.hashCode());
        result = prime * result + ((fecha_fin == null) ? 0 : fecha_fin.hashCode());
        result = prime * result + ((ultima_mod == null) ? 0 : ultima_mod.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TareaDTO other = (TareaDTO) obj;
        if (id_tarea == null) {
            if (other.id_tarea != null)
                return false;
        } else if (!id_tarea.equals(other.id_tarea))
            return false;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (descripcion == null) {
            if (other.descripcion != null)
                return false;
        } else if (!descripcion.equals(other.descripcion))
            return false;
        if (estado != other.estado)
            return false;
        if (fecha_creacion == null) {
            if (other.fecha_creacion != null)
                return false;
        } else if (!fecha_creacion.equals(other.fecha_creacion))
            return false;
        if (fecha_fin == null) {
            if (other.fecha_fin != null)
                return false;
        } else if (!fecha_fin.equals(other.fecha_fin))
            return false;
        if (ultima_mod == null) {
            if (other.ultima_mod != null)
                return false;
        } else if (!ultima_mod.equals(other.ultima_mod))
            return false;
        return true;
    }     
    
    
}
