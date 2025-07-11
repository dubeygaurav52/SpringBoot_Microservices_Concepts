package in.gaurav.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.gaurav.entity.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Serializable>{

}
