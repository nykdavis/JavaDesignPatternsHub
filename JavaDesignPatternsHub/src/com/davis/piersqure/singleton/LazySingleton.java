package com.davis.piersqure.singleton;

public class LazySingleton {

	private static LazySingleton obj = null;
	
	private LazySingleton() {
		
	}
	
	public static LazySingleton getInstance() {
		if( obj == null ) {
			obj = new LazySingleton();
		}
		return obj;
	}
	
	public void print() {
		System.out.println("Singleton object lazy loading.");
	}
	
	public static void main(String[] args) {
		
		LazySingleton instance = LazySingleton.getInstance();
		instance.print();

	}

}
