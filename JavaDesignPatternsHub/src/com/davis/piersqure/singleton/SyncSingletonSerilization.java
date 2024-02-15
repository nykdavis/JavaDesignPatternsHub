package com.davis.piersqure.singleton;

import java.io.Serializable;

public class SyncSingletonSerilization implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private static  volatile SyncSingletonSerilization obj;
	
	private SyncSingletonSerilization() {
		
	}
	public static SyncSingletonSerilization getInstance() {
		if(obj == null) {
			synchronized (SyncSingletonSerilization.class) {
				if(obj == null) {
					obj = new SyncSingletonSerilization();
				}	
			}
		}
		return obj;
	}
	
	protected Object readResolve() {
		return getInstance();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyncSingletonSerilization singleton = SyncSingletonSerilization.getInstance();
	}

}
