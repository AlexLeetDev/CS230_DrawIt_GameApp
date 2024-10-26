package com.gamingroom;

/**
 * A simple class to hold information about a game
 *
 * This class extends the base Entity class, inheriting common properties
 * such as 'id' and 'name'. Once created, games have unique identifiers 
 * and names that cannot be changed.
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 * Modifications:
 *  - Alex Leet (2024-09-22): Refactored to inherit from Entity class.
 */
public class Game extends Entity {

	/**
	 * Constructor with an identifier and name.
	 * 
	 * @param id   the unique identifier for the game
	 * @param name the name of the game
	 */
	public Game(long id, String name) {
		super(id, name);	// Use the parent Entity constructor
	}
	
	/**
	 * Returns a string representation of the game.
	 * 
	 * @return a formatted string showing the game's id and name
	 */
	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + "]";
	}
}
