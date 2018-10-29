import java.util.ArrayList;

public class Student {

	public String name;
	public int age;
	public String dob;
	public String id;
	public String username
	public String course;
	public ArrayList<Module> Modules = new ArrayList<Module>(); 

	public Student(String name, int age, String dob, String id, String course, Module module) {
		this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.course = course;
        this.Modules.add(module);
	}

	public getName() {
		return name;
	}

	public setName(String name) {
		this.name = name;
	}

	public getAge() {
		return age;
	}

	public setAge(int age) {
		this.age = age;
	}

	public getUsername() {
		username = name + age;
		return username;
	}
}