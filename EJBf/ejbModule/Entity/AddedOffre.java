package Entity;

import Entity.AddedOffrePK;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="addedoffre")
public class AddedOffre implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AddedOffrePK idAO;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateAjout;
//	@JoinColumn(name="idUser",referencedColumnName="idUser",insertable=false,updatable=false)
	@ManyToOne(optional=false)
	private Entreprise EMuser;
	
	//@JoinColumn(name="idOffre",referencedColumnName="idoffre",insertable=false,updatable=false)
	@ManyToOne(optional=false)
	private Offre aoffre;
	
	public AddedOffre() {
		super();
	}

	public AddedOffrePK getIdAO() {
		return idAO;
	}

	public void setIdAO(AddedOffrePK idAO) {
		this.idAO = idAO;
	}

	public Date getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}

	public Entreprise getEMuser() {
		return EMuser;
	}

	public void setEMuser(Entreprise eMuser) {
		EMuser = eMuser;
	}

	public Offre getAoffre() {
		return aoffre;
	}

	public void setAoffre(Offre aoffre) {
		this.aoffre = aoffre;
	}

	public AddedOffre(AddedOffrePK idAO, Date dateAjout, Entreprise eMuser, Offre aoffre) {
		super();
		this.idAO = idAO;
		this.dateAjout = dateAjout;
		EMuser = eMuser;
		this.aoffre = aoffre;
	} }
