package com.gamingroom;

/**
 * A simple class to hold information about a player
 * 
 * This class extends the base Entity class, inheriting common properties
 * such as 'id' and 'name'. Players have unique identifiers and names 
 * that cannot be changed once created.
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a player is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 * Modifications:
 *  - Alex Leet (2024-09-22): Refactored to inherit from Entity class.
 */
public class Player extends Entity {
	
	/**
	 * Constructor with an identifier and name.
	 * 
	 * @param id   the unique identifier for the player
	 * @param name the name of the player
	 */
	public Player(long id, String name) {
		super(id, name);	// Use the parent Entity constructor
	}
	
	/**
	 * Returns a string representation of the player.
	 * 
	 * @return a formatted string showing the player's id and name
	 */
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}
}
