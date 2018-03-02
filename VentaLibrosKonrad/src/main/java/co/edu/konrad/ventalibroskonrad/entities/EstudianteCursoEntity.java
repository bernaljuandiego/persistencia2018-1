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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author CISCO
 */
@Entity
public class EstudianteCursoEntity implements Serializable{
    
    private final static Long serialVersionUID = 1L;
 
    @Id
    @Column (name = "id_est_curso", unique = true, nullable = false)
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idEstudianteCurso;
    
    @ManyToOne 
    @JoinColumn (name = "id_estudiante")
    private EstudianteEntity estudiante;
    
    @ManyToOne
    @JoinColumn (name = "id_curso")
    private CursoEntity curso;
    
    @Column
    private int periodo;

    public Long getIdEstudianteCurso() {
        return idEstudianteCurso;
    }

    public void setIdEstudianteCurso(Long idEstudianteCurso) {
        this.idEstudianteCurso = idEstudianteCurso;
    }

    public EstudianteEntity getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(EstudianteEntity estudiante) {
        this.estudiante = estudiante;
    }

    public CursoEntity getCurso() {
        return curso;
    }

    public void setCurso(CursoEntity curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    
    
}
