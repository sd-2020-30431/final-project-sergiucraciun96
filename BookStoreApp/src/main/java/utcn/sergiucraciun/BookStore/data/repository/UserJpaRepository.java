package utcn.sergiucraciun.BookStore.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utcn.sergiucraciun.BookStore.data.entities.User;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
