import java.util.ArrayList;
import org.joda.time.DateTime;

public class CourseProgramme {

	public String course_name;
	public DateTime start_date;
	public DateTime end_date;
	public ArrayList<Student> students = new ArrayList<Student>();
	public ArrayList<Module> sodules = new ArrayList<Module>();

	public CourseProgramme(String course_name, DateTime start_date, DateTime end_date){
		this.course_name = course_name;
		this.start_date = start_date;
		this.end_date = end_date;

	}

	public String getName(){
		return course_name;
	}

	public void setName(String course_name){
		this.course_name = course_name;
	}

	public void setStartDate(){
		this.start_date = start_date;
	}

	public getStartDate(){
		return start_date;
	}

	public void setEndDate(){
		this.endDate = end_date;
	}

	public getEndDate(){
		return end_date;
	}

	public getModules(){
		return modules;
	}

	public getStudents(){
		return students;
	}

}