package utcn.sergiucraciun.BookStore.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utcn.sergiucraciun.BookStore.data.entities.ShoppingCart;
import utcn.sergiucraciun.BookStore.data.entities.User;

@Repository
public interface CartJpaRepository extends JpaRepository<ShoppingCart, Integer> {
    ShoppingCart findByUser(User user);
}
