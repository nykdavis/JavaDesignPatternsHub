package com.davis.piersqure.creational.abstractFactory;

public class BankFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bank) {
		if(bank.equalsIgnoreCase("HDFC")) {
			return new HDFC();
		}else if (bank.equalsIgnoreCase("SBI")) {
			return new SBI();
		}else if(bank.equalsIgnoreCase("PNB")) {
			return new PNB();
		}else {
			return null;
		}
	}

	@Override
	public Loan getLoan(String loan) {
		// TODO Auto-generated method stub
		return null;
	}

}
