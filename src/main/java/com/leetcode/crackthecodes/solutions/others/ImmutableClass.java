package com.leetcode.crackthecodes.solutions.others;

import java.util.HashMap;

public final class ImmutableClass {
	
	//required fields
	private final int id;
	private final String name;
	private final Employee employee;
	//optional fields
	private  HashMap<String, Employee> properties;
	private final String company;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public HashMap<String, Employee> getProperties() {
		//return cloned object to avoid changing it by the client application
		return (HashMap<String, Employee>) properties.clone();
	}

	public Employee getEmployee() {

		return employee;
//		try {
//			return (Employee) employee.clone();
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
//		return null;
	}

	public String getCompany() {
		return company;
	}
	public ImmutableClass(final int dnew, final String nameNew, HashMap<String, Employee> properties,final String company,final Employee employee){
		this.id=dnew;
		this.name = nameNew;
		this.properties = properties;
		this.company = company;
		this.employee = employee;
	}


//	private ImmutableClass(ImmutableClassBuilder builder) {
//		this.id = builder.id;
//		this.name = builder.name;
//		this.properties = builder.properties;
//		this.company = builder.company;
//	}
	
        //Builder class
//	public static class ImmutableClassBuilder{
//		//required fields
//		private int id;
//		private String name;
//
//		//optional fields
//		private HashMap<String, String> properties;
//		private String company;
//
//		public ImmutableClassBuilder(int i, String nm){
//			this.id=i;
//			this.name=nm;
//		}
//
//		public ImmutableClassBuilder setProperties(HashMap<String,String> hm){
//			this.properties = (HashMap<String, String>) hm.clone();
//			return this;
//		}
//
//		public ImmutableClassBuilder setCompany(String comp){
//			this.company = comp;
//			return this;
//		}
//
//		public ImmutableClass build(){
//			return new ImmutableClass(this);
//		}
//	}
}