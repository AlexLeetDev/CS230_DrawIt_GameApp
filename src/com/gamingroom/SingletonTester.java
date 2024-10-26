package com.gamingroom;

/**
 * A class to test a singleton's behavior
 * 
 * This class demonstrates that only one instance of the GameService class
 * can exist, in line with the Singleton pattern. It tests this by obtaining
 * the instance and printing out the current games.
 * 
 * @originalAuthor coce@snhu.edu
 * 
 * Modifications:
 *  - Alex Leet (2024-09-15): Fixed singleton reference by using GameService.getInstance().
 */
public class SingletonTester {

	public void testSingleton() {
		
		System.out.println("\nAbout to test the singleton...");
		
		// Obtain the singleton instance of GameService
        GameService service = GameService.getInstance();
		
        /*
         * Go through each game in the GameService.
         * Since GameService is a singleton, the same list of games
         * will be available everywhere in the program that uses this instance.
         */
		for (int i = 0; i < service.getGameCount(); i++) {
			System.out.println(service.getGame(i));
		}

	}
	
}
