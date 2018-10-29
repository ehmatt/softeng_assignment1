import java.util.ArrayList;

public class Module {

	public String module_name;
	public ArrayList<Student> Students = new ArrayList<Student>(); 
	public ArrayList<CourseProgramme> Course = new ArrayList<CourseProgramme>();

	public Module(String module_name, Student students, CourseProgramme course){
		this.module_name = module_name;
		this.Students.add(students);
		this.CourseProgramme.add(course);
	}

	public getName(){
		return module_name;
	}

	public setName(){
		this.module_name = module_name;
	}


}