package ma.fsbm.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.fsbm.Enumiration.Role;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Table(name = "ADMINS")
public class Admin extends User {
	 @Column(name = "ROLE")
	 @Enumerated(EnumType.STRING)
      private Role role;
	  @ManyToMany(mappedBy = "admin")
	  private List<Nouveaute> nouveautes=new ArrayList<>();
	  /*@ManyToMany(mappedBy = "admin")
	  private List<Notification> notifications=new ArrayList<>();*/

	  
	public Admin(Long Id, String UserName, String PassWord, String Name, String FirstName, Role role) {
		super(Id, UserName, PassWord, Name, FirstName);
		this.role = role;
	}
      
      
      
}
