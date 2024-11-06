package api.server.cosmicdetox.jwt.repository;

import api.server.cosmicdetox.jwt.entity.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findOneWithAuthoritiesByUsername(@NotBlank @Size(min = 3, max = 50) String username);
}
