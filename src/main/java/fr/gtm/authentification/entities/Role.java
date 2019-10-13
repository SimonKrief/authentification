package fr.gtm.authentification.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
@Access(AccessType.FIELD)
//@Embeddable
public class Role {
	@Id
	@Column
	private long pk;
	@Column
	private String role;
	
//	@ManyToMany
//	@JoinColumn(name="user")
	@Column
	private String user;	
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}	


		public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	public long getPk() {
		return pk;
	}
	

	
}
