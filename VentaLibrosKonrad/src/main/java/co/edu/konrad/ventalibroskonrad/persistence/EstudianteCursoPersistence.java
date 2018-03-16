/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.ventalibroskonrad.persistence;

import co.edu.konrad.ventalibroskonrad.entities.EstudianteCursoEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la Entidad EstudianteCurso
 *
 * @author Bryan
 */
@Stateless
public class EstudianteCursoPersistence {

    @PersistenceContext(unitName = "ventasPU")
    protected EntityManager em;

    /**
     * Método obtener toda la información de la tabla EstudianteCurso.
     *
     * @return lista de datos.
     */
    public List<EstudianteCursoEntity> findAll() {
        Query todos = em.createQuery("select ec from EstudianteCursoEntity ec");
        return todos.getResultList();
    }

    /**
     * Obtener un objeto estudiante apartir de un Id.
     *
     * @param id
     * @return estudiante que coincida con el Id.
     */
    public EstudianteCursoEntity find(Long id) {
        EstudianteCursoEntity estCurso = em.find(EstudianteCursoEntity.class, id);
        return estCurso;
    }

    /**
     * Crear un nuevo objeto de la Tabla EstudianteCurso
     *
     * @param estudianteAgregar
     * @return objeto a agregar
     */
    public EstudianteCursoEntity create(EstudianteCursoEntity estCursoAgregar) {
        em.persist(estCursoAgregar);
        return estCursoAgregar;
    }

    /**
     * Actualiza un objeto de la tabla EstudianteCurso
     * @param estCursoActualizar
     * @return objeto actualizado.
     */
    public EstudianteCursoEntity update(EstudianteCursoEntity estCursoActualizar) {
        return em.merge(estCursoActualizar);
    }
    
    /**
     * Elimina un objeto de EstudianteCurso por el id.
     * @param id 
     */
    public void delete(Long id){
        EstudianteCursoEntity estCursoDelete = em.find(EstudianteCursoEntity.class, id);
        em.remove(estCursoDelete); 
    }

}
