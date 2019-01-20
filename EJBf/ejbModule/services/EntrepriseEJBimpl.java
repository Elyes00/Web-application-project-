package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Entity.AddedOffre;
import Entity.Consultoffre;
import Entity.Entreprise;
import Entity.Offre;
import Entity.SimpleUser;

@Stateless
public class EntrepriseEJBimpl implements EntepriseService{
	@PersistenceContext(unitName="EJBf")
	private EntityManager em;

	@Override
	public void addSimpleUser(SimpleUser su) {
		// TODO Auto-generated method stub
		em.persist(su);	
	}

	@Override
	public void addEntreprise(Entreprise bm) {
		// TODO Auto-generated method stub
		em.persist(bm);
	}

	@Override
	public void addOffre(Offre b) {
		// TODO Auto-generated method stub
		em.persist(b);
	}

	@Override
	public void addAddedOffre(AddedOffre ab) {
		// TODO Auto-generated method stub
		em.persist(ab);
	}

	@Override
	public void addConsultoffre(Consultoffre db) {
		// TODO Auto-generated method stub
		em.persist(db);
	}

	@Override
	public SimpleUser getSimpleUserById(int idUser) {
		SimpleUser su=em.find(SimpleUser.class, idUser);
		if(su==null) throw new RuntimeException("SimpleUser introuvable");
		return su;
	}

	@Override
	public Entreprise getEntrepriseById(int idUser) {
		Entreprise bm=  em.find(Entreprise
				.class, idUser);
		if(bm==null) throw new RuntimeException("entreprise introuvable");
		return bm;
	}

	@Override
	public Offre getOffreId(int idOffre) {
		Offre b=  em.find(Offre.class, idOffre);
		if(b==null) throw new RuntimeException("offre introuvable");
		return b;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SimpleUser> getAllSimpleUser() {
		Query req=em.createQuery("select s from SimpleUser s");
		return req.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Entreprise> getAllEntreprise() {
		Query req=em.createQuery("select m from Entreprise m");
		return req.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Offre> getAllOffre() {
		Query req=em.createQuery("select b from Offre b");
		return req.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AddedOffre> getAllAddedOffre() {
		Query req=em.createQuery("select a from AddedOffre a");
		return req.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Consultoffre> getAllConsultoffre() {
		Query req=em.createQuery("select d from Consultoffre d");
		return req.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SimpleUser> getSimpleUserByName(String name) {
		Query req=em.createQuery("select s from SimpleUser s where s.nomS like "+name);
		return req.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Entreprise> getEntrepriseByName(String name) {
		 Query req=em.createQuery("select m from Entreprise m where m.nom like "+name);
			return req.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Offre> getOffreByTitle(String title) {
		 Query req=em.createQuery("select b from Offre b where b.titre like "+title);
			return req.getResultList();
	}

	@Override
	public void updateSimpleUser(SimpleUser su) {
		em.merge(su);	
		
	}

	@Override
	public void updateEntreprise(Entreprise bm) {
		// TODO Auto-generated method stub
		em.merge(bm);
	}

	@Override
	public void updateOffre(Offre b) {
		// TODO Auto-generated method stub
		em.merge(b);	
	}

	@Override
	public void removeSimpleUser(int idUser) {
		SimpleUser simple = em.find(SimpleUser.class, idUser);
		em.remove(simple);
		
	}

	@Override
	public void removeEntreprise(int idUser) {
		Entreprise entreprise = em.find(Entreprise.class, idUser);
		em.remove(entreprise);	
	}

	@Override
	public void removeOffre(int idOffre) {
		// TODO Auto-generated method stub
		Offre offre = em.find(Offre.class, idOffre);
		em.remove(offre);	
	}
}
