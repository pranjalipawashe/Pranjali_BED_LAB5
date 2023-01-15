import com.greatlearing.employeemgmt.model.Employee;

public interface EmployeeService
{
	
	public list<Employee> getAllEmployees();
    public void saveOrUpdate(Employee emp);
    public void deleteEmployeeById(int id);
    public Employee getEmployeeById(int id);    

}