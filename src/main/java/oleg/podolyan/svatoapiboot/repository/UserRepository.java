package oleg.podolyan.svatoapiboot.repository;

import oleg.podolyan.svatoapiboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    List<User> findAll();
}
