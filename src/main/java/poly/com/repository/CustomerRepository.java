package poly.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import poly.com.entitis.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

}
