package services;

import java.util.List;

import javax.ejb.Local;

import Entity.AddedOffre;
import Entity.Consultoffre;
import Entity.Entreprise;
import Entity.Offre;
import Entity.SimpleUser;

@Local
public interface EntepriseService {

	public void addSimpleUser(SimpleUser su);
	public void addEntreprise(Entreprise bm);
	public void addOffre(Offre b);
	public void addAddedOffre(AddedOffre ab);
	public void addConsultoffre(Consultoffre db);
	
	public SimpleUser getSimpleUserById(int idUser);
	public Entreprise getEntrepriseById(int idUser);
	public Offre getOffreId(int idOffre);
	
	public List<SimpleUser> getAllSimpleUser();
	public List<Entreprise> getAllEntreprise();
	public List<Offre> getAllOffre();
	public List<AddedOffre> getAllAddedOffre();
	public List<Consultoffre> getAllConsultoffre();
	
	public List<SimpleUser> getSimpleUserByName(String name);
	public List<Entreprise> getEntrepriseByName(String name);
	public List<Offre> getOffreByTitle(String title);
	
	public void updateSimpleUser(SimpleUser su);
	public void updateEntreprise(Entreprise bm);
	public void updateOffre(Offre b);
	
	public void removeSimpleUser(int idUser);
	public void removeEntreprise(int idUser);
	public void removeOffre(int idOffre);
	
}
