package com.practica.crud_apirest.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.crud_apirest.dto.TareaDTO;
import com.practica.crud_apirest.service.TareaService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api/tareas")
public class TareaController {


    private final TareaService servicioTarea;

    public TareaController(TareaService servicioTarea){
        this.servicioTarea = servicioTarea;
    }

    @GetMapping
    public List<TareaDTO> Listar(){

        return servicioTarea.serviceListTareas();
    }

    @GetMapping("/{idTarea}")
    public TareaDTO buscarTarea(@Valid @PathVariable Long idTarea) {
        return servicioTarea.serviceGetTarea(idTarea);
    }
    

    @PostMapping
    public TareaDTO insertarTarea(@Valid @RequestBody TareaDTO dto) {
        
        return servicioTarea.serviceAddTarea(dto);
    }

    @PutMapping("/{idTarea}")
    public TareaDTO actualizarTarea(@Valid @PathVariable Long idTarea,@Valid @RequestBody TareaDTO dto) {
        
        return servicioTarea.serviceUpdateTarea(idTarea, dto);
    }

    @DeleteMapping("/{idTarea}")
    public ResponseEntity<Void> borrarTarea(@Valid @PathVariable Long idTarea){
        servicioTarea.serviceDeleteTarea(idTarea);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{idTarea}/status")
    public TareaDTO actualizarCampoTarea(@Valid @PathVariable Long idTarea, @Valid @RequestBody Map<String, Object> campos) {

        return servicioTarea.serviceUpdateFieldTarea(idTarea, campos);
    }   
    
    

}
