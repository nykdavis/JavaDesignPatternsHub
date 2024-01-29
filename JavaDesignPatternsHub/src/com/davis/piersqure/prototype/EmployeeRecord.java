package com.davis.piersqure.prototype;

public class EmployeeRecord implements Prototype {

	private int id;
	private String name, designation;
	private double salary;
	private String address;

	public EmployeeRecord() {
		super();
	}

	public EmployeeRecord(int id, String name, String designation, double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
	}

	public void shoeRecord() {
		System.out.println(id + "\t" + name + "\t" + designation + "\t" + salary + "\t" + address);
	}

	@Override
	public Prototype getClone() {
		return new EmployeeRecord(id, name, designation, salary, address);
	}

}
