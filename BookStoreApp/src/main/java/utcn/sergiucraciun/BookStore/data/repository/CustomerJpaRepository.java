package utcn.sergiucraciun.BookStore.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utcn.sergiucraciun.BookStore.data.entities.Customer;
import utcn.sergiucraciun.BookStore.data.entities.User;

import java.util.List;

@Repository
public interface CustomerJpaRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findAll();
    Customer findByUser(User user);
}
