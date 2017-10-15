package com.designpattern.singleton;

public class BillPughSingleton {
	private String description;

	private BillPughSingleton() {
	}

	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
