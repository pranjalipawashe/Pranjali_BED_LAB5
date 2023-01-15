import com.greatlearing.employeemgmt.model.Employee;
import com.greatlearing.employeemgmt.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import org.springframework.stereotype.Service;
import com.greatlearning.employeemgmt.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	
	@Autowired 
	EmployeeRepository repository;
	
	@Override
	public List<Employee> getAllEmployees()
	{
		return repository.findAll();
	}
	
	@Override
	public void saveOrUpdate(Employee emp)
	{
		repository.save(emp);
	}
	
	@Override
	public void deleteEmployeeById(int id)
	{
		repository.deleteById(id);
	}
	
	@Override
	public void getEmployeeById(int id)
	{
		return repository.findById(id).get();
	}
}