package com.davis.piersqure.creational.abstractFactory;

abstract public class AbstractFactory {
	public abstract Bank getBank(String bank);

	public abstract Loan getLoan(String loan);
}
