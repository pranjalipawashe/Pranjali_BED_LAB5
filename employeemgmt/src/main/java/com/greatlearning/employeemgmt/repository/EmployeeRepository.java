import com.greatlearing.employeemgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearing.employeemgmt.model.Employee;
	
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	
	
	
	
}