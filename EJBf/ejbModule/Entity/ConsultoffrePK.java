package Entity;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class ConsultoffrePK implements Serializable {

	@Column(name="idOffre")
	private int idOffre;
	@Column(name="idUser")
	private int idUser;
	private static final long serialVersionUID = 1L;
	
	public ConsultoffrePK() {
		super();
	}  
	public ConsultoffrePK(int idUser,int idBook) {
		this.idUser=idUser;
		this.idOffre=idBook;
	}
	public int getIdOffre() {
		return this.idOffre;
	}

	public void setIdOffre(int idBook) {
		this.idOffre = idBook;
	}   
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idUser;
		result = prime * result + idOffre;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsultoffrePK other = (ConsultoffrePK) obj;
		if (idOffre != other.idOffre)
			return false;
		if (idUser != other.idUser)
			return false;
		return true;
	}
   
}
