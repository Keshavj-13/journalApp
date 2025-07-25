package net.engineeringdigest.journalApp.repository;
import net.engineeringdigest.journalApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
