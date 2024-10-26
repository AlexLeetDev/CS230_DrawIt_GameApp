package com.gamingroom;

/**
 * Application start-up program
 * 
 * This class shows how to use the GameService Singleton to add games.
 * It also checks that only one instance of GameService is used by testing 
 * it with SingletonTester.
 * 
 * @originalAuthor coce@snhu.edu
 * 
 * Modifications:
 *  - Alex Leet (2024-09-15): Added initial functionality for adding games and singleton test.
 *  - Alex Leet (2024-09-22): Added functionality to add teams and players, including duplicate checks.
 */
public class ProgramDriver {
	
	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		// Obtain reference to the singleton instance of GameService
        GameService service = GameService.getInstance();
		
		System.out.println("\nAbout to test initializing game data...");
		
		// initialize with some game data
		Game game1 = service.addGame("Game #1");
		System.out.println(game1);
		Game game2 = service.addGame("Game #2");
		System.out.println(game2);
		
		// Test: Attempt to add a duplicate game
		Game duplicateGame = service.addGame("Game #1");
		System.out.println(duplicateGame); // Should return the existing game
		
		// Test: Adding teams to the games
		System.out.println("\nAbout to test adding teams...");
		Team team1 = service.addTeam("Team Alpha");
		System.out.println(team1);
		Team team2 = service.addTeam("Beta");
		System.out.println(team2);
		
		// Test: Attempt to add a duplicate team
		Team duplicateTeam = service.addTeam("Team Alpha");
		System.out.println(duplicateTeam); // Should return the existing team
		
		// Test: Adding players to the teams
		System.out.println("\nAbout to test adding players...");
		Player player1 = service.addPlayer("Player 1");
		System.out.println(player1);
		Player player2 = service.addPlayer("Player 2");
		System.out.println(player2);
		
		// Test: Attempt to add a duplicate player
		Player duplicatePlayer = service.addPlayer("Player 1");
		System.out.println(duplicatePlayer); // Should return the existing player
		
		// Test: Singleton functionality via SingletonTester class
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
		
		// Additional test: Edge case - Attempt to add a game with an empty name
		System.out.println("\nAbout to test edge case: adding a game with an empty name...");
		try {
			Game emptyGame = service.addGame("");
			System.out.println(emptyGame);
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		// Additional test: Edge case - Attempt to add a team with an empty name
		System.out.println("\nAbout to test edge case: adding a team with an empty name...");
		try {
			Team emptyTeam = service.addTeam("");
			System.out.println(emptyTeam);
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		// Additional test: Edge case - Attempt to add a player with an empty name
		System.out.println("\nAbout to test edge case: adding a player with an empty name...");
		try {
			Player emptyPlayer = service.addPlayer("");
			System.out.println(emptyPlayer);
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		// Test: Print the number of active games, teams, and players
		System.out.println("\nSummary of entities:");
		System.out.println("Number of active games: " + service.getGameCount());
		System.out.println("Number of active teams: " + service.getTeamCount());
		System.out.println("Number of active players: " + service.getPlayerCount());	
	}
}
