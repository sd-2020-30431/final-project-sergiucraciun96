package utcn.sergiucraciun.BookStore;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import utcn.sergiucraciun.BookStore.business.ShippingService;
import utcn.sergiucraciun.BookStore.data.entities.ShippingInfo;
import utcn.sergiucraciun.BookStore.data.entities.User;

import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.when;

public class ShippingTest {

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    ShippingService shippingService;

    @Test
    public void shouldFindByPhone1() {
        User user = new User(15, "sergiucraciun", "abcd", 1);
        ShippingInfo info = new ShippingInfo(14, "Stefan cel Mare 1", 24, "0753025523");

        when(shippingService.findByPhone("0753025523")).thenReturn(info);
        assertTrue(shippingService.findByPhone("0753025523").equals(info));
    }

    @Test
    public void shouldFindByPhone2() {
        User user2 = new User(14, "mihai", "5678", 1);
        ShippingInfo info2 = new ShippingInfo(15, "21, caminul 7", 23, "0789456123");

        when(shippingService.findByPhone("0789456123")).thenReturn(info2);
        assertTrue(shippingService.findByPhone("0789456123").equals(info2));
    }

    @Test
    public void shouldCheckAge() {
        ShippingInfo info2 = new ShippingInfo(13, "21, caminul 7", 22, "0789456123");

        when(shippingService.checkAge(info2)).thenReturn(true);
        assertTrue(shippingService.checkAge(info2));
    }
}
