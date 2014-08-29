package com.designPatterns.FilterPattern;

public class Person {
	private String name;
	private String gender;
	private String maritalStatus;

	public Person(String name, String gender, String maritalStatus) {
		super();
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	public String getName() {
		return this.name;
	}

	public String getGender() {
		return this.gender;
	}

	public String getMaritalStatus() {
		return this.maritalStatus;
	}
}