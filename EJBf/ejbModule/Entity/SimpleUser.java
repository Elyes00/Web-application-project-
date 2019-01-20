package Entity;

import Entity.User;
import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="simpleuser")
public class SimpleUser extends User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nomS;
	private String prenomS;
	private int numtelS;
	private String emailS;
	private int nbreoffreconsulter;
	@OneToMany(mappedBy="Suser")
	private List<Consultoffre> consultoffre; 


	public int getNbreoffreconsulter() {
		return nbreoffreconsulter;
	}
	public void setNbreoffreconsulter(int nbreoffreconsulter) {
		this.nbreoffreconsulter = nbreoffreconsulter;
	}
	public List<Consultoffre> getConsultoffre() {
		return consultoffre;
	}
	public void setConsultoffre(List<Consultoffre> consultoffre) {
		this.consultoffre = consultoffre;
	}
	public SimpleUser() {
		super();
	}   
	public String getNomS() {
		return this.nomS;
	}

	public void setNomS(String nomS) {
		this.nomS = nomS;
	}   
	public String getPrenomS() {
		return this.prenomS;
	}

	public void setPrenomS(String prenomS) {
		this.prenomS = prenomS;
	}   
	public int getNumtelS() {
		return this.numtelS;
	}

	public void setNumtelS(int numtelS) {
		this.numtelS = numtelS;
	}   
	public String getEmailS() {
		return this.emailS;
	}

	public void setEmailS(String emailS) {
		this.emailS = emailS;
	}   
	public int getNbrelivretelech() {
		return this.nbreoffreconsulter;
	}

	public void setNbrelivretelech(int nbreoffreconsulter) {
		this.nbreoffreconsulter = nbreoffreconsulter;
	}
	public SimpleUser(String userName,String password,String nomS,String prenomS,int numtelS,String emailS,int nbreoffreconsulter) {
		setUserName(userName);
		setPassword(password);
		this.nomS=nomS;
		this.prenomS=prenomS;
		this.numtelS=numtelS;
		this.emailS=emailS;
		this.nbreoffreconsulter=nbreoffreconsulter;
	}
   
}
