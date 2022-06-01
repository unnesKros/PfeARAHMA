package ma.fsbm.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.fsbm.Enumiration.LotType;
import ma.fsbm.Enumiration.Zone;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Lotissement {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private Double Surface;
	 @Enumerated(EnumType.STRING)
	 private LotType lotType;
	 @Enumerated(EnumType.STRING)
	 private Zone zone;
	 @ManyToOne()
	 private Inscription inscription;
	 @OneToMany(mappedBy = "lotissement")
	 private List<Appartement> appartements;
	
	 
}
