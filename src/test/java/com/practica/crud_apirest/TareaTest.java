package com.practica.crud_apirest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;

import com.practica.crud_apirest.dto.TareaDTO;
import com.practica.crud_apirest.entity.Estado;
import com.practica.crud_apirest.entity.Tarea;
import com.practica.crud_apirest.repository.Repo_Tareas;
import com.practica.crud_apirest.service.TareaService;

@ExtendWith(MockitoExtension.class)
public class TareaTest {

    @Mock
    private Repo_Tareas tareaRepo;

    @InjectMocks
    private TareaService tareaService;

    private TareaDTO tareaDTO;
    
    private Tarea tareaEntidad;

    @BeforeEach
    void setUp(){

        tareaEntidad = new Tarea();
        tareaEntidad.setId_tarea(1L);
        tareaEntidad.setTitulo("titulo");
        tareaEntidad.setDescripcion("Test unitario");
        tareaEntidad.setEstado(Estado.POR_HACER);
        tareaEntidad.setFecha_creacion(LocalDateTime.now());
        tareaEntidad.setFecha_fin(LocalDateTime.now());
        tareaEntidad.setUltima_mod(LocalDateTime.now());

        tareaDTO = new TareaDTO();;
        tareaDTO.setId_tarea(1L);
        tareaDTO.setTitulo("titulo");
        tareaDTO.setDescripcion("Test unitario");
        tareaDTO.setEstado(Estado.POR_HACER);
        tareaDTO.setFecha_creacion(LocalDateTime.now());
        tareaDTO.setFecha_fin(LocalDateTime.now());
        tareaDTO.setUltima_mod(LocalDateTime.now());
    }


    //Consulta Tareas

    //Buscar tareas

    //Insertar tareas

    //actualizar tareas

    //eliminar tareas

    //actualizar un campo de una tarea

    @Test 
    void consulta_devuelveLista() {
        List<Tarea> listaEntidades = List.of(tareaEntidad);
        Mockito.when(tareaRepo.findAll()).thenReturn(listaEntidades);

        List<TareaDTO> resultado = tareaService.service_ConsultaTareas();

        assertNotNull(resultado);
        assertEquals(1, resultado.size());
        assertEquals("titulo", resultado.get(0).getTitulo());
        Mockito.verify(tareaRepo, Mockito.times(1)).findAll();

    }

}
