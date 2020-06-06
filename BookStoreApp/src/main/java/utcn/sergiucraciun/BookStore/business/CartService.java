package utcn.sergiucraciun.BookStore.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utcn.sergiucraciun.BookStore.data.entities.Product;
import utcn.sergiucraciun.BookStore.data.entities.ShoppingCart;
import utcn.sergiucraciun.BookStore.data.entities.User;
import utcn.sergiucraciun.BookStore.data.repository.CartJpaRepository;

import java.util.List;


@Service
public class CartService {
    @Autowired
    CartJpaRepository cartJpaRepository;

    public void insertCart(ShoppingCart cart) {
        cartJpaRepository.save(cart);
    }

    public ShoppingCart findCartByUser(User user) {
        return cartJpaRepository.findByUser(user);
    }

    public void addToCart(ShoppingCart cart, Product product) {
        List<Product> newList = cart.getProducts();
        newList.add(product);
        cart.setProducts(newList);
        cartJpaRepository.save(cart);
    }

    public void emptyCart(ShoppingCart cart) {
        cart.getProducts().removeAll(cart.getProducts());
        cartJpaRepository.save(cart);
    }
}
