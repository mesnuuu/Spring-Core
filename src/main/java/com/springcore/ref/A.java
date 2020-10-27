package com.springcore.ref;

public class A {

	public A() {
		// TODO Auto-generated constructor stub
	}

	private String name;
	private B profession;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public B getProfession() {
		return profession;
	}

	public void setProfession(B profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		return "A [name=" + name + ", profession=" + profession + "]";
	}

}
