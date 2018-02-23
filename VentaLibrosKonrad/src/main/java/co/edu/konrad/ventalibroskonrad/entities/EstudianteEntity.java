/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.ventalibroskonrad.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Clase para modelar la entidad estudiante
 * @author Juan Diego Bernal Pedroza
 */
@Entity(name = "Estudiante")
public class EstudianteEntity implements Serializable{
    
    //atributo estatico para el manejo de versiones de la entidad
    private static final long serialVersionUID = 1L;
    
    // llave primaria de la entidad estudiante
    @Id
    @Column (name = "id_estudiante", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEstudiante;
    
    // variable que almacena el nombre del estudiante
    @Column (name = "nombre", nullable = false)
    private String nombreEstudiante;
    
    // variable que almacena el apellido del estudiante
    @Column (name = "apellido", nullable = false)
    private String apellidoEstudiante;
    
    // variable que almacena el correo del estudiante
    @Column (name = "email", nullable = false)
    private String correoEstudiante;
    
    // variable que almacena el codigo del estudiante
    @Column (name = "codigo", nullable = false)
    private String codigoEstudiante;

    //Metodos GET y SET
    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
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

    public String getCorreoEstudiante() {
        return correoEstudiante;
    }

    public void setCorreoEstudiante(String correoEstudiante) {
        this.correoEstudiante = correoEstudiante;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }
    
    
    
    
    
    
}
