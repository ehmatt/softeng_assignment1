import java.util.ArrayList;

public class Module {

	public String module_name;
	public ArrayList<Student> Students = new ArrayList<Student>(); 
	public ArrayList<CourseProgramme> Courses = new ArrayList<CourseProgramme>();

	public Module(String module_name, Student Students, CourseProgramme Courses){
		this.module_name = module_name;
		this.Students.add(Students);
		this.CourseProgramme.add(Courses);
	}

	public getName(){
		return module_name;
	}

	public setName(){
		this.module_name = module_name;
	}


}