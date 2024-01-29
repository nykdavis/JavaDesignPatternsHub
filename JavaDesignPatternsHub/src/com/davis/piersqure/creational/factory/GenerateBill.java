package com.davis.piersqure.creational.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

	public static void main(String[] args) throws IOException {

		GetPlanFactory factory = new GetPlanFactory();

		System.out.println("Enter the Plan Name for which the bill will be generated.");
		System.out.println("DOMESTICPLAN");
		System.out.println("COMMERCIALPLAN");
		System.out.println("INSTITUTIONALPLAN");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String planName = br.readLine();

		System.out.println("Enter the number of units for bill will be caculated:");
		int units = Integer.parseInt(br.readLine());

		Plan plan = factory.getPlan(planName);

		System.out.println("Bill amount for " + planName + " of " + units + " unit is:");
		plan.getRate();
		plan.calculateBill(units);

	}

}
