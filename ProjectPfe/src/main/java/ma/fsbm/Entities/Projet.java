package ma.fsbm.Entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor 
@Table(name = "PROJETS")
public class Projet {
	@Id @Column(name = "Nom",unique = true)
	private String Name;
	private double prixTE;
	private double prixTP;
	private double totalDepense;
	@OneToMany(mappedBy = "projet")
	private List<Depense> depenses;
}
