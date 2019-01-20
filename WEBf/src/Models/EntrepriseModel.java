package Models;

import java.util.ArrayList;
import java.util.List;

import Entity.Entreprise;
import Entity.Offre;

public class EntrepriseModel {
	private String motcle;
	private String mot;
	private List<Entreprise> entreprises= new ArrayList<Entreprise>();
	private List<Offre> offres=new ArrayList<Offre>();
	public String getMotcle() {
		return motcle;
	}
	public void setMotcle(String motcle) {
		this.motcle = motcle;
	}
	public List<Entreprise> getEntreprises() {
		return entreprises;
	}
	public void setEntreprises(List<Entreprise> entreprises) {
		this.entreprises = entreprises;
	}
	public String getMot() {
		return mot;
	}
	public void setMot(String mot) {
		this.mot = mot;
	}
	public List<Offre> getOffres() {
		return offres;
	}
	public void setOffres(List<Offre> offres) {
		this.offres = offres;
	}

	
}
