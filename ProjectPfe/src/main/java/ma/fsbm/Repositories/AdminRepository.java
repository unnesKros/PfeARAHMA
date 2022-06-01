package ma.fsbm.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.fsbm.Entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

}
