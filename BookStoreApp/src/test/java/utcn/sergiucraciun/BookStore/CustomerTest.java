package utcn.sergiucraciun.BookStore;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import utcn.sergiucraciun.BookStore.business.CustomerService;
import utcn.sergiucraciun.BookStore.data.entities.Customer;
import utcn.sergiucraciun.BookStore.data.entities.ShippingInfo;
import utcn.sergiucraciun.BookStore.data.entities.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class CustomerTest {

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    CustomerService customerService;

    @Test
    public void shouldFindByUser() {
        User user = new User(11, "sergiucraciun", "abcd", 1);
        ShippingInfo info = new ShippingInfo(12, "Stefan cel MAre 1", 24, "0753025523");
        Customer customer = new Customer.CustomerBuilder().setCustomerId(5).setName("Dan Fulga").setUser(user).setInfo(info).build();

        when(customerService.findByUser(user)).thenReturn(customer);
        assertTrue(customerService.findByUser(user).equals(customer));
    }

    @Test
    public void shouldListAllCustomers() {
        User user = new User(15, "sergiucraciun", "abcd", 1);
        ShippingInfo info = new ShippingInfo(14, "Stefan cel MAre 1", 24, "0753025523");
        Customer customer = new Customer.CustomerBuilder().setCustomerId(5).setName("Craciun Sergiu").setUser(user).setInfo(info).build();

        User user2 = new User(14, "mihai", "5678", 1);
        ShippingInfo info2 = new ShippingInfo(15, "21, caminul 7", 23, "0789456123");
        Customer customer2 = new Customer.CustomerBuilder().setCustomerId(3).setName("Mihai").setUser(user2).setInfo(info2).build();

        User user3 = new User(18, "sergiu", "9012", 1);
        ShippingInfo info3 = new ShippingInfo(15, "Strada Salcamului 37", 23, "0789123123");
        Customer customer3 = new Customer.CustomerBuilder().setCustomerId(6).setName("Sergiu").setUser(user3).setInfo(info3).build();

        List<Customer> customers = new ArrayList<>();
        customers.add(customer);
        customers.add(customer2);
        customers.add(customer3);

        when(customerService.findAll()).thenReturn(customers);
        assertTrue(customerService.findAll().equals(customers));
    }

}
