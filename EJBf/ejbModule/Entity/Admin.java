package Entity;

import Entity.User;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;


@Entity
@Table(name="admin")
public class Admin extends User implements Serializable {

	
	private String adminUser="elyes";
	private String adminPassword="benamor";
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}   
	public String getAdminUser() {
		return this.adminUser;
	}

	public void setAdminUser(String adminUser) {
		this.adminUser = adminUser;
	}   
	public String getAdminPassword() {
		return this.adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
   
}
