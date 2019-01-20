package Entity;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="offre")
public class Offre implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id
	@Basic(optional=false)
	@Column(name="idoffre")
	private int idOffre;
	private String titre;
	private String datePub;
	private String description;
	
	@OneToMany(mappedBy="aoffre")
	private List<AddedOffre> addedoffre;
	@OneToMany(mappedBy="doffre")
	private List<Consultoffre> consultoffre;



	public List<Consultoffre> getConsultoffre() {
		return consultoffre;
	}



	public void setConsultoffre(List<Consultoffre> consultoffre) {
		this.consultoffre = consultoffre;
	}



	public Offre() {
		super();
	}



	public int getIdOffre() {
		return idOffre;
	}



	public void setIdOffre(int idOffre) {
		this.idOffre = idOffre;
	}



	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}



	public String getDatePub() {
		return datePub;
	}



	public void setDatePub(String datePub) {
		this.datePub = datePub;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public List<AddedOffre> getAddedoffre() {
		return addedoffre;
	}



	public void setAddedoffre(List<AddedOffre> addedoffre) {
		this.addedoffre = addedoffre;
	}



	public Offre(int idOffre, String titre, String datePub, String description) {
		super();
		this.idOffre = idOffre;
		this.titre = titre;
		this.datePub = datePub;
		this.description = description;
		//this.addedoffre = addedoffre;
	}   
	
   
}
