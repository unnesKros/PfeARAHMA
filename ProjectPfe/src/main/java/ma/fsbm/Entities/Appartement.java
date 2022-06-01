package ma.fsbm.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.fsbm.Enumiration.Zone;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Appartement {
	  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  private double surface;
	  private String type;
	  private Zone zone;
	  private double prixEs;
	  @ManyToOne
	  private Inscription inscription;
	  @ManyToOne
	  private Lotissement lotissement;
	  

}
