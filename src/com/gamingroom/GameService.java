package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 * @originalAuthor coce@snhu.edu
 * 
 * Modifications:
 *  - Alex Leet (2024-09-15): Implemented Singleton and unique game names.
 *  - Alex Leet (2024-09-22): Added teams and players with uniqueness checks.
 */
public class GameService {

    /**
     * A list of the active games
     */
    private static List<Game> games = new ArrayList<Game>();
    
    /**
     * A list of the active teams
     */
    private static List<Team> teams = new ArrayList<Team>();
    
    /**
     * A list of the active players
     */
    private static List<Player> players = new ArrayList<Player>();

    /**
     * Keeps track of the next game, team, and player ID
     */
    private static long nextGameId = 1;
    private static long nextTeamId = 1;
    private static long nextPlayerId = 1;

    // Singleton instance of GameService
    private static GameService instance = null;

    /*
     * Singleton Pattern Explanation:
     * The Singleton pattern makes sure that only one GameService 
     * object exists. This object is shared everywhere in the code 
     * where it's needed. We do this by creating a single, static 
     * instance of GameService, which is returned through the 
     * getInstance() method.
     */

    // Private constructor to stop others from creating new instances
    private GameService() {
        // This prevents others from making a new GameService object
    }

    /**
     * This method gives access to the only instance of GameService.
     * If the instance doesn't exist yet, it creates one. 
     * 
     * @return The only instance of GameService
     */
    public static GameService getInstance() {
        if (instance == null) {
            instance = new GameService();
        }
        return instance;
    }

    /**
     * Adds a new game if a game with the same name doesn't exist yet.
     * 
     * @param name the name of the game
     * @return the new or existing game
     */
    
    /*
     * Iterator Pattern Explanation:
     * The Iterator pattern is used here to loop through the list of games
     * to check if a game with the same name or ID already exists. This helps
     * us avoid creating duplicates.
     */

    public Game addGame(String name) {
    	if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Game name cannot be empty.");
    	}
    	
        Game game = getGame(name); // Check if the game already exists

        // If the game is not found, make a new one and add it to the list
        if (game == null) {
            game = new Game(nextGameId++, name);
            games.add(game);
        }

        return game; // Return the new or existing game
    }
    
    /**
     * Adds a new team if a team with the same name doesn't exist yet.
     * 
     * @param name the name of the team
     * @return the new or existing team	
     */
    public Team addTeam(String name) {
    	if (name == null || name.trim().isEmpty()) {
    		throw new IllegalArgumentException("Team name cannot be empty.");
    	}
    	
    	Team team = getTeam(name); // Check if the team already exists
    	
    	// If the team is not found, make a new one and add it to the list
    	if (team == null) {
    		team = new Team(nextTeamId++, name);
    		teams.add(team);
    	}
    	
    	return team; // Return the new or existing team
    }
    
    /**
     * Adds a new player if a player with the same name doesn't exist yet.
     * 
     * @param name the name of the player
     * @return the new or existing player
     */
    public Player addPlayer(String name) {
    	if (name == null || name.trim().isEmpty()) {
    		throw new IllegalArgumentException("Player name cannot be empty.");
    	}
    	
    	Player player = getPlayer(name); // Check if the player already exists
    	
    	// If the player is not found, make a new one and add it to the list
    	if (player == null) {
    		player = new Player(nextPlayerId++, name);
    		players.add(player);
    	}
    	
    	return player; // Return the new or existing player
    }

    /**
     * Returns the game at a certain position in the list
     * 
     * @param index position in the list
     * @return the game at that position
     */
    public Game getGame(int index) {
        return games.get(index);
    }

    /**
     * Returns the game with a certain ID
     * 
     * @param id the ID of the game
     * @return the game with the matching ID or null if not found
     */
    
    public Game getGame(long id) {
        // Go through all games to find the one with the matching ID
        for (Game game : games) {
            if (game.getId() == id) {
                return game; // Return the game if found
            }
        }
        return null; // Return null if no game with the given ID is found
    }

    /**
     * Returns the game with a certain name
     * 
     * @param name the name of the game
     * @return the game with the matching name or null if not found
     */
    
    public Game getGame(String name) {
        // Go through all games to find the one with the matching name
        for (Game game : games) {
            if (game.getName().equalsIgnoreCase(name)) {
                return game; // Return the game if found
            }
        }
        return null; // Return null if no game with the given name is found
    }
    
    /**
     * Returns the team with a certain name
     * 
     * @param name the name of the team
     * @return the team with the matching name or null if not found
     */
    public Team getTeam(String name) {
    	for (Team team : teams) {
    		if (team.getName().equalsIgnoreCase(name)) {
    			return team; // Return the team if found
    		}
    	}
    	return null; // Return null if no team with the given name is found
    }
    
    /**
     * Returns the player with a certain name
     * 
     * @param name the name of the player
     * @return the player with the matching name or null if not found
     */
    public Player getPlayer(String name) {
    	for (Player player : players) {
    		if (player.getName().equalsIgnoreCase(name)) {
    			return player; // Return the player if found
    		}
    	}
    	return null; // Return null if no player with the given name is found
    }

    /**
     * Returns the number of active games
     * 
     * @return the number of active games
     */
    public int getGameCount() {
        return games.size();
    }
    
    /**
     * Returns the number of active teams
     * 
     * @return the number of active teams
     */
    public int getTeamCount() {
    	return teams.size();
    }
    
    /**
     * Returns the number of active players
     * 
     * @return the number of active players
     */
    public int getPlayerCount() {
    	return players.size();
    }
}
