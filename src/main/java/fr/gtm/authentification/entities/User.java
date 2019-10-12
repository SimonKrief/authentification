package fr.gtm.authentification.entities;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name = "users")
@Access(AccessType.FIELD)
@NamedQueries({
		@NamedQuery(name = "User.byName",
					query = "SELECT u.user FROM User u WHERE u.user =:user"),

		@NamedQuery(name = "Nom.all",
					query = "SELECT u.user FROM User u"),
		
		@NamedQuery(name = "User.byPassword",
					query = "SELECT u FROM User u WHERE UPPER(u.password) = :password")


})
public class User {//implements Serializable 
	@Id
	@Column(name= "id")
	private long id;
	@Column(name= "user")
	private String user;
	@Column(name= "password")
	private String password;
	@Column(name= "role")
	private String role;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [user=" + user + "]";
	}
	

}
