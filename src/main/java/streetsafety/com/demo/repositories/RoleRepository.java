package streetsafety.com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import streetsafety.com.demo.entities.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
