package sg.nus.iss.register.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.nus.iss.register.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,String>{
	
	boolean existsByUserName(String userName);
	
	@Query("Select c from Customer as c where c.userName = : userName")
	public ArrayList<Customer> findCustomerByuserName(@Param("userName") String keyword);
}
