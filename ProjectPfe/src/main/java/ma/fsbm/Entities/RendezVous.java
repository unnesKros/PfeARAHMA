package ma.fsbm.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.fsbm.Enumiration.Operation;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class RendezVous {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date date;
	private Operation operation; 
	private String description;
	@ManyToOne
	private Client client;

}
