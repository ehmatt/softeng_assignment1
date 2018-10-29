import java.util.ArrayList;
import org.joda.time.DateTime;

public class CourseProgramme {

	public String course_name;
	public DateTime start_date;
	public DateTime end_date;
	public ArrayList<Student> Students = new ArrayList<Student>();
	public ArrayList<Module> Modules = new ArrayList<Module>();

	public setStartDate(){
		this.start_date = start_date;
	}

	public getStartDate(){
		return start_date;
	}

	public setEndDate(){
		this.endDate = end_date;
	}

	public getEndDate(){
		return end_date;
	}

}