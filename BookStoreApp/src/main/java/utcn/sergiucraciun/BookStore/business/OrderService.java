package utcn.sergiucraciun.BookStore.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utcn.sergiucraciun.BookStore.data.entities.Order;
import utcn.sergiucraciun.BookStore.data.repository.OrderJpaRepository;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderJpaRepository orderJpaRepository;

    public void insertOrder(Order order) {
        orderJpaRepository.save(order);
    }

    public List<Order> findAll() {
        return orderJpaRepository.findAll();
    }
}
