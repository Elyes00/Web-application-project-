package Entity;

import Entity.ConsultoffrePK;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name="consultoffre")
public class Consultoffre implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private ConsultoffrePK idBD;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateConsult;
	
	@JoinColumn(name="idUser",referencedColumnName="idUser",insertable=false,updatable=false)
	@ManyToOne(optional=false)
	private SimpleUser Suser;
	
	@JoinColumn(name="idOffre",referencedColumnName="idOffre",insertable=false,updatable=false)
	@ManyToOne(optional=false)
	private Offre doffre;

	public Consultoffre() {
		super();
	} 
	public Consultoffre(ConsultoffrePK idBD) {
		this.idBD=idBD;
		this.dateConsult=new Date();
	} 
	public ConsultoffrePK getidBD() {
		return this.idBD;
	}

	public void setidBD(ConsultoffrePK idBD) {
		this.idBD = idBD;
	} 
	
	public SimpleUser getSimpleUser() {
		return Suser;
	}
	public void setSimpleUser(SimpleUser Suser) {
		this.Suser=Suser;
	}
	public Offre getOffre() {
		return doffre;
	}
	public void setOffre(Offre offre) {
		this.doffre=offre;
	}
	public Date getDateConsult() {
		return this.dateConsult;
	}

	public void setDateConsult(Date dateDownload) {
		this.dateConsult = dateDownload;
	}
   
}
