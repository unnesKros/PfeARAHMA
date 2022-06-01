package ma.fsbm.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.fsbm.Entities.Lotissement;

public interface LotRepository extends  JpaRepository<Lotissement, Long>{

}
