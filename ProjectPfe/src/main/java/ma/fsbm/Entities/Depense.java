package ma.fsbm.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Depense {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float prix;
    private String objectif;
    @ManyToOne 
    private Projet projet;
}
