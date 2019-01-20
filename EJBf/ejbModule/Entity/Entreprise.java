package Entity;

import Entity.User;
import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="entreprise")
public class Entreprise extends User implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nom;
	private String description;
	private int numtelM;
	private String emailM;
	private int nbredoffre;
	private int nbeployee;
	@OneToMany(mappedBy="EMuser")
	private List<AddedOffre> addedoffre;

	public Entreprise() {
		super();
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNumtelM() {
		return numtelM;
	}

	public void setNumtelM(int numtelM) {
		this.numtelM = numtelM;
	}

	public String getEmailM() {
		return emailM;
	}

	public void setEmailM(String emailM) {
		this.emailM = emailM;
	}

	public int getNbredoffre() {
		return nbredoffre;
	}

	public void setNbredoffre(int nbredoffre) {
		this.nbredoffre = nbredoffre;
	}

	public int getNbeployee() {
		return nbeployee;
	}

	public void setNbeployee(int nbeployee) {
		this.nbeployee = nbeployee;
	}

	public List<AddedOffre> getAddedoffre() {
		return addedoffre;
	}

	public void setAddedoffre(List<AddedOffre> addedoffre) {
		this.addedoffre = addedoffre;
	}

	public Entreprise(String userName,String password, String nom, String description, int numtelM, String emailM, int nbredoffre,
			int nbeployee) {
		super();
		setUserName(userName);
		setPassword(password);
		//this.reference = reference;
		this.nom = nom;
		this.description = description;
		this.numtelM = numtelM;
		this.emailM = emailM;
		this.nbredoffre = nbredoffre;
		this.nbeployee = nbeployee;
		//this.addedoffre = addedoffre;
	}   
	   
}
