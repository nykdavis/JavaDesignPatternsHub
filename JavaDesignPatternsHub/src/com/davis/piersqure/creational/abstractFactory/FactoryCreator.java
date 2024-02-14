package com.davis.piersqure.creational.abstractFactory;

public class FactoryCreator {
	public static AbstractFactory getFactory(String value) {
		if (value.equalsIgnoreCase("Bank")) {
			return new BankFactory();
		} else if (value.equalsIgnoreCase("Loan")) {
			return new LoanFactory();
		}
		return null;
	}
}
