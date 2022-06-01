package ma.fsbm.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Virement {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private double montant;
   private String ref;
   @Temporal(TemporalType.DATE)
   private Date dateVerser;
   @ManyToOne()
   private Inscription inscription;
}
