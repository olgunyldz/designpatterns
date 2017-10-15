package com.designpattern.singleton;

public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;
	
	private String description ;

	private StaticBlockSingleton() {
	}

	// static block initialization for exception handling
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
