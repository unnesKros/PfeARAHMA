package ma.fsbm.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Inscription {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	@OneToMany(mappedBy ="inscription"  ,fetch = FetchType.EAGER)
	 private List<Lotissement> Lots=new ArrayList<>();
	@ManyToMany(mappedBy = "ins" ,fetch = FetchType.LAZY)
	 private List<Client> cls=new ArrayList<>();
	@OneToMany(mappedBy = "inscription")
	 private List<Virement> virements;
	@OneToMany(mappedBy = "inscription")
	private List<Appartement> appartements;
	
	
	 

}
