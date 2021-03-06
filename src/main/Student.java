package ie.nuigalway.matthew;

import java.util.ArrayList;

public class Student {

	public String name;
	public int age;
	public String dob;
	public String id;
	public String username;
	public ArrayList<CourseProgramme> courses = new ArrayList<CourseProgramme>();
	public ArrayList<Module> modules = new ArrayList<Module>(); 

	public Student(String name, int age, String dob, String id, String course, Module module) {
		this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.CourseProgramme.add(courses);
        this.Modules.add(modules);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUsername() {
		username = name + String.valueOf(age);
		return username;
	}

	public getModules() {
		return modules;
	}

	public getCourses() {
		return courses;
	}
}