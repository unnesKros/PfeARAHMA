package ma.fsbm;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ma.fsbm.Entities.Admin;
import ma.fsbm.Entities.Client;
import ma.fsbm.Entities.Inscription;
import ma.fsbm.Entities.Lotissement;
import ma.fsbm.Entities.User;
import ma.fsbm.Enumiration.LotType;
import ma.fsbm.Enumiration.Role;
import ma.fsbm.Enumiration.Zone;
import ma.fsbm.Repositories.AdminRepository;
import ma.fsbm.Repositories.ClientRepository;
import ma.fsbm.Repositories.InscriptionRepository;
import ma.fsbm.Repositories.LotRepository;
import ma.fsbm.Service.insriservice; 

@SpringBootApplication
public class ProjectPfeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectPfeApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(InscriptionRepository inscriptionRepository,AdminRepository adminRepository,ClientRepository clientRepository,LotRepository lotRepository) {
		return args -> {
			/*Client client=new Client(null, "sabile","hafa", "nom", "prenom", null, null, null, null, null, null, null) ;
		    clientRepository.save(client);*/
		    
		     
		};
	}

}
