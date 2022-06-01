package ma.fsbm.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.fsbm.Entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
   
}
