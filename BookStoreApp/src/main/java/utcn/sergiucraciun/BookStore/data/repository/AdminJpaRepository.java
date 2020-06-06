package utcn.sergiucraciun.BookStore.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utcn.sergiucraciun.BookStore.data.entities.Admin;

@Repository
public interface AdminJpaRepository extends JpaRepository<Admin, Integer> {
}
