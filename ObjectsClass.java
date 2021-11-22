package com.trial.interviews;

import java.util.Objects;

public class ObjectsClass {
	
	//Objects class was introduced in java 7 which includes null checks,hashcode, compare, toSTring
	
	static class Person{
		
		public Person(String name, String job) {
			super();
			this.name = name;
			this.job = job;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getJob() {
			return job;
		}
		public void setJob(String job) {
			this.job = job;
		}
		String name;
		String job;
	}
	
	public static void main(String[] args) {
		
		Person person = null;
		
		//Objects.requireNonNull(person, "person is null");
		
		System.out.println(Objects.isNull(person));
		
	}

}
