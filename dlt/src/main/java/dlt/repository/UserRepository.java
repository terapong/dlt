package dlt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dlt.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
