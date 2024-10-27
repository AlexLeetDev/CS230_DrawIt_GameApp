# Code Details for Draw It or Lose It Game Expansion

This document provides an in-depth look at each code file in the **Draw It or Lose It** project. It includes descriptions of each class, key methods, design patterns, and code snippets.

## Table of Contents

---

## Entity.java

The `Entity` class is a base class that provides common attributes (`id` and `name`) for all entities in the game, such as games, teams, and players. This class includes:

- **Attributes**:
  - `id`: A unique identifier for each entity.
  - `name`: The name of the entity.
  
- **Methods**:
  - `getId()`: Returns the entity's ID.
  - `getName()`: Returns the entity's name.

### Complete Code for Entity.java

```java
public class Entity {
    private long id;
    private String name;

    public Entity(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
```

## Game.java

The `Game` class manages multiple teams within a game instance, using a one-to-many relationship with `Team`. This class provides functionality to add and retrieve teams within the game.

- **Attributes**:
  - `teams`: A list that holds `Team` objects, representing the teams participating in the game.

- **Methods**:
  - `addTeam(Team team)`: Adds a new `Team` object to the list of teams in the game.
  - `getTeams()`: Returns the list of `Team` objects associated with the game.

### Complete Code for Game.java

```java
import java.util.ArrayList;
import java.util.List;

public class Game extends Entity {
    private List<Team> teams;

    public Game(long id, String name) {
        super(id, name);
        teams = new ArrayList<>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public List<Team> getTeams() {
        return teams;
    }
}
```

## Team.java

The `Team` class represents a team in the game and contains a list of players. It provides functionality to add players to the team and retrieve the list of players.

- **Attributes**:
  - `players`: A list that holds `Player` objects, representing the players on the team.

- **Methods**:
  - `addPlayer(Player player)`: Adds a new `Player` object to the list of players in the team.
  - `getPlayers()`: Returns the list of `Player` objects associated with the team.

### Complete Code for Team.java

```java
import java.util.ArrayList;
import java.util.List;

public class Team extends Entity {
    private List<Player> players;

    public Team(long id, String name) {
        super(id, name);
        players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public List<Player> getPlayers() {
        return players;
    }
}
```

## Player.java

The `Player` class represents an individual participant within a team and inherits common attributes (`id` and `name`) from the `Entity` class.

### Complete Code for Player.java

```java
public class Player extends Entity {
    public Player(long id, String name) {
        super(id, name);
    }
}
```

## GameService.java

The `GameService` class manages game instances and ensures only one instance of itself exists using the Singleton design pattern. This class contains a list of games and provides methods to retrieve the Singleton instance.

- **Attributes**:
  - `instance`: A static variable that holds the Singleton instance of `GameService`.
  - `games`: A list that stores active `Game` instances.

- **Methods**:
  - `getInstance()`: Returns the single instance of `GameService`, creating it if it doesn’t already exist.

### Complete Code for GameService.java

```java
import java.util.ArrayList;
import java.util.List;

public class GameService {
    private static GameService instance;
    private List<Game> games;

    private GameService() {
        games = new ArrayList<>();
    }

    public static synchronized GameService getInstance() {
        if (instance == null) {
            instance = new GameService();
        }
        return instance;
    }

    public List<Game> getGames() {
        return games;
    }

    public void addGame(Game game) {
        games.add(game);
    }
}
```

## ProgramDriver.java

The `ProgramDriver` class is the main entry point for the application. It initializes the `GameService` instance and sets up any required game components. This is where the game logic begins execution.

### Complete Code for ProgramDriver.java

```java
public class ProgramDriver {
    public static void main(String[] args) {
        GameService gameService = GameService.getInstance();
        // Additional game initialization logic can be added here.
        
        System.out.println("Game Service initialized. Ready to manage games!");
    }
}
```

## SingletonTester.java *(Optional)*

The `SingletonTester` class is a utility class for testing the Singleton pattern in `GameService`. It verifies that only one instance of `GameService` is created by comparing two retrieved instances. This class is optional because it serves only a testing purpose and is not part of the main application functionality.

### Complete Code for SingletonTester.java

```java
public class SingletonTester {
    public static void testSingleton() {
        GameService service1 = GameService.getInstance();
        GameService service2 = GameService.getInstance();
        
        if (service1 == service2) {
            System.out.println("Singleton works: Both instances are the same.");
        } else {
            System.out.println("Singleton failed: Instances are different.");
        }
    }

    public static void main(String[] args) {
        testSingleton();
    }
}
```
