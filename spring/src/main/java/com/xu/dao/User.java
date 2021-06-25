package com.xu.dao;

//@Component
public class User {

//	@Value("asd")
	String Name;
//	@Value("11")
	int Age;
	String Ex;

	@Override
	public String toString() {
		return "User{" +
				"Name='" + Name + '\'' +
				", age=" + Age +
				", ex='" + Ex + '\'' +
				'}';
	}

	public User() {
	}

	public User(String name, int age, String ex) {
		Name = name;
		this.Age = age;
		this.Ex = ex;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}

	public String getEx() {
		return Ex;
	}

	public void setEx(String ex) {
		this.Ex = ex;
	}

}
