/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.entities.Recruiter;

/**
 *
 * @author khalid
 */
@Stateless
public class RecruiterFacade extends AbstractFacade<Recruiter> {
    @PersistenceContext(unitName = "ConsultingAgencyPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RecruiterFacade() {
        super(Recruiter.class);
    }
    
}
