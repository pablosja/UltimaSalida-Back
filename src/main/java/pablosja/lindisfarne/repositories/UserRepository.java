package pablosja.lindisfarne.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import pablosja.lindisfarne.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findByUsername(String username);
}
