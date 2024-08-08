package Sringboot_service_Type2_example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@Autowired
	StudentService sserv; //object of service layer.
	
	
	//basic end point for test run. 
	@GetMapping("/test")
	public String test()
	{
		return "This is service type 2";
	}
	
	//endpoint for saving student data.
	@PostMapping("/save")
	public Student save(@RequestBody Student student)
	{
		return sserv.addStudent(student);
	}
	
	//endpoint for displaying the student data in the form of list.
	@GetMapping("/show")
	public List<Student> show()
	{
		return sserv.studentlist();
	}
	
	//endpoint for retreving a specific student data using name.  
	@GetMapping("/{name}")
	public List<Student> ByName(@PathVariable String name)
	{
		return sserv.getName(name);
	}
	
	//endpoint for updating the data.
	@PutMapping("/update/{id}")
	public Student update(@PathVariable int id,@RequestBody Student student)
	{
		return sserv.updatebyid(id, student);
	}
	
	//endpoint for retreving a specific student data using id. 
	@GetMapping("/byid/{id}")
	public Optional<Student> ById(@PathVariable int id)
	{
		return sserv.getById(id);
	}
	
	//endpoint for deleting student data.
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		return sserv.deleteById(id);
	}
}
