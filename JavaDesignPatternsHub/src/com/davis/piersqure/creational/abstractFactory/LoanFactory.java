package com.davis.piersqure.creational.abstractFactory;

public class LoanFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		if(loan.equalsIgnoreCase("CAR")) {
			return new CarLoan();
		}else if(loan.equalsIgnoreCase("EDUCATION")) {
			return new EducationLoan();
		}else if(loan.equalsIgnoreCase("HOME")) {
			return new HomeLoan();
		}else {
			return null;
		}
	}

}
