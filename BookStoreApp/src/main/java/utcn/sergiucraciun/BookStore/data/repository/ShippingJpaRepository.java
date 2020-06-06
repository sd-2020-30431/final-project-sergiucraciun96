package utcn.sergiucraciun.BookStore.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utcn.sergiucraciun.BookStore.data.entities.ShippingInfo;

@Repository
public interface ShippingJpaRepository extends JpaRepository<ShippingInfo, Integer> {
    ShippingInfo findByPhone(String phone);
}
