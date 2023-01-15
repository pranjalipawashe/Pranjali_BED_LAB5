import com.greatlearing.employeemgmt.service.EmployeeService;

@Controller
public class EmployeeController
{
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/employees")
	public String getAllEmployees(Model model) 
	{
		List<Employee> results = service.getAllEmployees();
		model.addAttribute("employees", results);
		return "employees";
	}
	
	@GetMapping("/employees/new")
	public String addNewEmployee(Model model) {
		Employee result = new  Employee();
		model.addAttribute("employees", result);
		return "create_employee";
	}
	
	@GetMapping("/employees/edit/{id}")
	public String updateEmployee(Model model, @PathVariable("id") int id )
	{
		Employee result = service.getEmployeeById(id);
		model.addAttribute("employees", results);
		return "edit_employee";
	}
	
	@GetMapping("/employees/delete/{id}")
	public String deleteEmployee(@PathVariable("id") int id )
	{
		service.deleteEmployeeById(id);	
		return "redirect:/employees" ;
	}
	
	@PostMapping("/employees")
	public String saveNewEmployee(@ModelAttribute("employee") Employee emp)
	{
		service.saveOrUpdate(emp);
		return "redirect:/employees";
	}
	
	@PostMapping("/employees")
	public String updateEmployee(@ModelAttribute("employee") Employee emp, @PathVariable("id") int id  )
	{
		Employee existingEmployee = service.getEmployeeByI(id);
		existingEmployee.setFirstName(emp.getFirstName());
		existingEmployee.seLastName(emp.getLastName());
		existingEmployee.setEmail(emp.getEmail());
		
		service.saveOrUpdate(existingEmployee);
		return "redirect:/employees";
	}
}