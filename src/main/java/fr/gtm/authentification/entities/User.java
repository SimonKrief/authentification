package fr.gtm.authentification.entities;

import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
					query = "SELECT u FROM User u WHERE UPPER(u.password) = :password"),
		
		@NamedQuery(name = "Role.all",
					query = "SELECT DISTINCT u.role FROM User u")

})
public class User {
	@Id
	@Column(name= "id")
	private long id;
	@Column(name= "user")
	private String user;
	@Column(name= "password")
	private String password;
	
//	@ManyToMany
//	@JoinColumn(name="role")
	@Column
	private String role;
	
//	@ElementCollection(fetch=FetchType.EAGER)
//	@CollectionTable(name="roles",joinColumns=@JoinColumn(name="user"))
//	@Column(name="role")
//	private List<String> roles; 
	
	
//	@Embedded
//	private Role role;
//	
//	public Role getRole() {
//		return role;
//	}
//	public void setRole(Role role) {
//		this.role = role;
//	}	
	
//	public List<String> getRoles() {
//		return roles;
//	}
//	public void setRoles(List<String> role) {
//		this.roles = role;
//	}
	
	
	
	
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

	
	@Override
	public String toString() {
		return "User [user=" + user + "]";
	}
	

}
