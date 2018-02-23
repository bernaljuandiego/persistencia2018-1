/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.ventalibroskonrad.persistence;

import co.edu.konrad.ventalibroskonrad.entities.EstudianteEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *Manejador de la entidad Estudiante
 * @author Juan Diego Bernal
 */
@Stateless
public class EstudiantePersistence {
    @PersistenceContext(name = "ventasPU")
    protected EntityManager em;
    
    // obtiene la lista con los datos de la tabla estudiante
    // datos de todos los estudiantes
    public List<EstudianteEntity> findAll(){
        Query todos = em.createQuery("select e from EstudianteEntity e");
        return todos.getResultList();
    }
    
    //encontrar una tupla especifica de la tabla estudiante por el id
    public EstudianteEntity find(Long id){
        EstudianteEntity estudiante = em.find(EstudianteEntity.class, id);
        return estudiante;
    }
    
    /**
     * Creacion de un nuevo estudiante
     * @param estudiante
     * @return nuevo estudiante creado
     */
    public EstudianteEntity create(EstudianteEntity estudiante){
        em.persist(estudiante);
        return estudiante;
    }
    
    /**
     * actualizacion de la tabla estudiante
     * @param estudianteActualizar
     * @return estudiante actualizado
     */
    public EstudianteEntity update (EstudianteEntity estudianteActualizar){
        return em.merge(estudianteActualizar);
    }
    
    /**
     * Elimina una Tupla 
     * @param id 
     */
    public void delete(Long id){
        EstudianteEntity estudianteDelete = em.find(EstudianteEntity.class, id);
        em.remove(estudianteDelete);
    }

//    public EstudianteEntity findByNombre(String nombre){
//        return estudiante;
//    }
}
