package edu.pitt.cs;

public class CatImpl implements Cat {

	// just getting it to trigger
	// TODO: Fill in with member variables

	private int id;
	private String name;
	private boolean rented; // Default is false
	
	// CONSTRUCTOR for CatIMPL
	public CatImpl(int id, String name) {
		// TODO: Fill in

		// I think they will be used 
		this.id = id;
		this.name = name;
		this.rented = false; 			
		
	}

	// renting the cat flip the boolean
	public void rentCat() {
		// TODO: Fill in

		this.rented = true;
	}

	// giving the cat back so it is no longer rented
	public void returnCat() {
		// TODO: Fill in

		this.rented = false;
		
	}

	public void renameCat(String name) {
		// TODO: Fill in
		this.name = name;
	
	}

	public String getName() {
		// TODO: Fill in
		return this.name;
	}

	// returning the instance at which is being utizilized
	public int getId() {
		// TODO: Fill in
		return this.id;
	}

	public boolean getRented() {
		// TODO: Fill in
		return this.rented;
	}

	public String toString() {
		// TODO: Fill in
		return "ID " + this.id + ". " + this.name;
	}

}