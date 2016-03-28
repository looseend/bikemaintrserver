package org.looseend.bikemaintr.server.model;

public class Bike {

	private int id;
	private String name;

	public Bike(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
