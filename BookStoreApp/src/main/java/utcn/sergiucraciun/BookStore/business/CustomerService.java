package utcn.sergiucraciun.BookStore.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utcn.sergiucraciun.BookStore.data.entities.Customer;
import utcn.sergiucraciun.BookStore.data.entities.User;
import utcn.sergiucraciun.BookStore.data.repository.CustomerJpaRepository;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerJpaRepository customerJpaRepository;

    public void insertCustomer(Customer customer) {
        customerJpaRepository.save(customer);
    }

    public List<Customer> findAll() {
        return customerJpaRepository.findAll();
    }

    public Customer findByUser(User user) {
        return  customerJpaRepository.findByUser(user);
    }
}
