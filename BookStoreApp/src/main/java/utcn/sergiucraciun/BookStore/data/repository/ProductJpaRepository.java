package utcn.sergiucraciun.BookStore.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utcn.sergiucraciun.BookStore.data.entities.Product;

import java.util.List;

@Repository
public interface ProductJpaRepository extends JpaRepository<Product, Integer> {
    List<Product> findAll();
    Product findByName(String title);
}
