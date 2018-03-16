/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.ventalibroskonrad.dto;

import co.edu.konrad.ventalibroskonrad.entities.EstudianteEntity;
import java.util.ArrayList;
import java.util.List;

/**
 * DTO para el mapeo objeto relacional de una entidad estudiante
 *
 * @author Bryan
 */
public class EstudianteDTO {

    /**
     * Id del estudiante
     */
    private long id;

    /**
     * Nombre del estudiante
     */
    private String nombreEstudiante;

    /**
     * Apellido del estudiante
     */
    private String apellidoEstudiante;

    /**
     * Codigo del estudiante
     */
    private int codigoEstudiante;

    /**
     * Correo del estudiante
     */
    private String correoEstudiante;

    /**
     * Constructor por defecto
     */
    public EstudianteDTO() {
    }
    
    /**
     * Constructor
     * @param estudiante 
     */
    public EstudianteDTO(EstudianteEntity estudiante){
        this.id = estudiante.getIdEstudiante();
        this.nombreEstudiante = estudiante.getNombreEstudiante();
        this.apellidoEstudiante = estudiante.getApellidoEstudiante();
        this.correoEstudiante = estudiante.getCorreoElectronico();
        this.codigoEstudiante = estudiante.getCodigoEstudiante();
    }
    
    public EstudianteEntity toEntity(){
        EstudianteEntity estudiante = new EstudianteEntity();
        estudiante.setIdEstudiante(id);
        estudiante.setNombreEstudiante(nombreEstudiante);
        estudiante.setApellidoEstudiante(apellidoEstudiante);
        estudiante.setCorreoElectronico(correoEstudiante);
        estudiante.setCodigoEstudiante(codigoEstudiante);
        return estudiante;
    }
    
    public List<EstudianteDTO> toEstudianteList(List<EstudianteEntity> estudianteList){
        List<EstudianteDTO> listaEstudiantes = new ArrayList<>();
        for (EstudianteEntity estudiante : estudianteList) {
            listaEstudiantes.add(new EstudianteDTO(estudiante));
        }
        return listaEstudiantes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCorreoEstudiante() {
        return correoEstudiante;
    }

    public void setCorreoEstudiante(String correoEstudiante) {
        this.correoEstudiante = correoEstudiante;
    }
    
}
