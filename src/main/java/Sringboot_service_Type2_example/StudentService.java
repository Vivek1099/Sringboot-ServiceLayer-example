package Sringboot_service_Type2_example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//It contains logic of your application. 
//It defines which functionalities you provide, how they are accessed, and what to pass and get in return.

@Service
public class StudentService 
{
	@Autowired
	StudentRepository srepo;
	
	public Student addStudent(Student student)
	{
		return srepo.save(student);
	}
	
	public List<Student> studentlist()
	{
		return srepo.findAll();
	}
	
	public List<Student> getName(String name)
	{
		return srepo.findByName(name);
	}
	
	public Student updatebyid(int id,Student student)
	{
		Student s=srepo.findById(id).get();
		s.setName(student.getName());
		s.setAge(student.getAge());
		s.setSchool(student.getSchool());
		return srepo.save(s);
	}
	
	public Optional<Student> getById(int id)
	{
		return srepo.findById(id);
	}
	
}
