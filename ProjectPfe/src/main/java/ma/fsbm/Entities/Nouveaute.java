package ma.fsbm.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Nouveaute {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private String vid;
	 private String img;
	 private String description;
	 @Temporal(TemporalType.DATE)
	 private Date date ;
	 @ManyToMany()
	 private List<Admin> admin=new ArrayList<>();
}
