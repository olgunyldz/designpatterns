package com.designpattern.singleton;

public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance;
	private String description;

	private LazyInitializedSingleton() {
	}

	public static LazyInitializedSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
