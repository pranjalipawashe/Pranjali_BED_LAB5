import com.greatlearing.employeemgmt.model;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Getter
@Setter
class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private int id;
	
	@Column(name = "emp_firstName")
	private String firstName;
	
	@Column(name = "emp_lastName")
	private String lastName;
	
	@Column(name = "emp_email")
	private String email;
		
	
}