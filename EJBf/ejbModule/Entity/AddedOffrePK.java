package Entity;

import java.io.Serializable;
import javax.persistence.*;
@Embeddable
public class AddedOffrePK implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name="idUser")
	private int idUser;
	@Column(name="idOffre")
	private int idOffre;
	public AddedOffrePK() {
		super();
	} 
	public AddedOffrePK(int idUser,int idOffre) {
		this.idUser=idUser;
		this.idOffre=idOffre;
	}
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}   
	public int getIdBook() {
		return this.idOffre;
	}

	public void setIdOffre(int idOffre) {
		this.idOffre = idOffre;
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
		AddedOffrePK other = (AddedOffrePK) obj;
		if (idUser != other.idUser)
			return false;
		if (idOffre != other.idOffre)
			return false;
		return true;
	}

   
}
