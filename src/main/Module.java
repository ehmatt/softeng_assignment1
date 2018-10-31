import java.util.ArrayList;

public class Module {

	public String module_name;
	public ArrayList<Student> students = new ArrayList<Student>(); 
	public ArrayList<CourseProgramme> courses = new ArrayList<CourseProgramme>();

	public Module(String module_name, Student Students, CourseProgramme Courses){
		this.module_name = module_name;
		this.Students.add(Students);
		this.CourseProgramme.add(Courses);
	}

	public String getName(){
		return module_name;
	}

	public void setName(){
		this.module_name = module_name;
	}

	public String getStudents(){
		return students;
	}

	public void getCourses(){
		return courses;
	}


}