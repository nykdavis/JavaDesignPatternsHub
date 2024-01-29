package com.davis.piersqure.singleton;

public class EgarSingleton {
		
	//Create the instance of Singleton during the class loading
	private static final EgarSingleton obj = new EgarSingleton();
	
	
	//Private constructor to prevent instantion from outside
	private EgarSingleton() {
		
	}
		
	//Global point of access for singleton method
	public static EgarSingleton getinstance() {
		return obj;
	}
	
	
	public void display() {
		System.out.println("Eger Singleton Instance.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EgarSingleton singletonObj = EgarSingleton.getinstance();
		singletonObj.display();

	}

}
