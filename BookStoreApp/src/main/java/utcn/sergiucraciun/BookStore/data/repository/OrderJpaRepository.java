package utcn.sergiucraciun.BookStore.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utcn.sergiucraciun.BookStore.data.entities.Order;

import java.util.List;

@Repository
public interface OrderJpaRepository extends JpaRepository<Order, Integer> {
    List<Order> findAll();
}
