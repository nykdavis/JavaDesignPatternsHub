package com.davis.piersqure.prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeMain {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter employee Id: ");
		int eid = Integer.parseInt(br.readLine());
		System.out.println("\n");

		System.out.println("Enter employee Name: ");
		String ename = br.readLine();
		System.out.println("\n");

		System.out.println("Enter employee Designation: ");
		String edesignation = br.readLine();
		System.out.println("\n");

		System.out.println("Enter employee Address: ");
		String eaddress = br.readLine();
		System.out.println("\n");

		System.out.println("Enter employee Salary: ");
		Double esalary = Double.parseDouble(br.readLine());
		System.out.println("\n");

		EmployeeRecord employee1 = new EmployeeRecord(eid, ename, edesignation, esalary, eaddress);
		employee1.shoeRecord();

		EmployeeRecord employee2 = (EmployeeRecord) employee1.getClone();
		employee2.shoeRecord();

	}

}
