package com.davis.piersqure.creational.abstractFactory;

public class AbstractFactoryPattern {

	public static void main(String[] args) {
		FactoryCreator factory = new FactoryCreator();
		factory.getFactory("Bank").getBank("HDFC").getBankName();
		

	}

}
