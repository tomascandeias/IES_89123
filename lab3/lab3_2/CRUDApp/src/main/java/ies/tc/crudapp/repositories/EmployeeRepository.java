package ies.tc.crudapp.repositories;

import ies.tc.crudapp.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	Employee findByEmailId(String emailId);
}
