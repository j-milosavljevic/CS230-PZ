/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Manifestacija;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Petra
 */
@Stateless
public class ManifestacijaFacade extends AbstractFacade<Manifestacija> {

    @PersistenceContext(unitName = "CS230-ProjectPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ManifestacijaFacade() {
        super(Manifestacija.class);
    }
    
}
