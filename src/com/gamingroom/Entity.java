package com.gamingroom;

/**
 * A base class to hold common information about an entity.
 * 
 * This class will be inherited by Game, Team, and Player classes.
 * Contains the shared properties 'id' and 'name' and methods to access these attributes.
 * 
 * @author Alex Leet
 * @date 2024-09-22 
 */

public class Entity {
	// Common attributes
	protected long id;
	protected String name;
	
	/**
	 * Constructor with an identifier and name
	 * 
	 * @param id	the unique identifier for the entity
	 * @param name	the name of the entity
	 */
	public Entity(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns a string representation of the entity.
	 * 
	 * @return a formatted string showing the entity's id and name
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName() + " [id=" + id + ", name=" + name + "]";
	}
}
