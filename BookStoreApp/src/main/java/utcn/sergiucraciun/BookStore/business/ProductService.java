package utcn.sergiucraciun.BookStore.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utcn.sergiucraciun.BookStore.data.entities.Product;
import utcn.sergiucraciun.BookStore.data.repository.ProductJpaRepository;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductJpaRepository productJpaRepository;

    public void insertProduct(Product product) {
        productJpaRepository.save(product);
    }

    public List<Product> findAllProducts() {
        return productJpaRepository.findAll();
    }

    public Product findByTitle(String title) {
        return productJpaRepository.findByName(title);
    }
}
