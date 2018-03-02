/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.ventalibroskonrad.persistence;

import co.edu.konrad.ventalibroskonrad.entities.EstudianteCursoEntity;
import co.edu.konrad.ventalibroskonrad.entities.EstudianteEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author CISCO
 */
@Stateless
public class EstudianteCursoPersistence {
    
    @PersistenceContext(unitName = "ventasPU")
    protected EntityManager em;
    
    public List<EstudianteCursoEntity> findAll(){
        Query query = em.createQuery("select ec from EstudianteCursoEntity ec");
        return query.getResultList();
    }
    
    public EstudianteCursoEntity find(Long id){
        EstudianteCursoEntity estudianteCurso = em.find(EstudianteCursoEntity.class, id);
        return estudianteCurso;
    }
    
     public EstudianteCursoEntity create(EstudianteCursoEntity estudianteCursoAgregar){
        em.persist(estudianteCursoAgregar);
        return estudianteCursoAgregar;
    }
     
    public EstudianteCursoEntity update (EstudianteCursoEntity estudianteCursoActualizar){
        return em.merge(estudianteCursoActualizar);
    }
    
    public void delete (Long id){
        EstudianteCursoEntity estudianteCursoDelete = em.find(EstudianteCursoEntity.class, id);
        em.remove(estudianteCursoDelete);
    }
}
