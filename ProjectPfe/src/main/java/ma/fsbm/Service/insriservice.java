package ma.fsbm.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import ma.fsbm.Entities.Client;
import ma.fsbm.Entities.Inscription;
import ma.fsbm.Repositories.ClientRepository;
import ma.fsbm.Repositories.InscriptionRepository;

@Service
@Transactional
@AllArgsConstructor
public class insriservice {
	InscriptionRepository inscriptionRepository;
	ClientRepository clientRepository;
	public void w(Client client,Inscription inscription) {
		 client.getIns().add(inscription);
		 inscription.getCls().add(client);
		 inscriptionRepository.save(inscription);
		 clientRepository.save(client);
	}

}
