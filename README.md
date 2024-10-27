# Draw It or Lose It Game Expansion | Academic Project for Cross-Platform Development

> **Note**: This project is a hypothetical scenario developed for academic purposes.

![GitHub repo size](https://img.shields.io/github/repo-size/AlexLeetDev/CS230_DrawIt_GameApp)
![GitHub contributors](https://img.shields.io/github/contributors/AlexLeetDev/CS230_DrawIt_GameApp)
![GitHub last commit](https://img.shields.io/github/last-commit/AlexLeetDev/CS230_DrawIt_GameApp)
![GitHub license](https://img.shields.io/github/license/AlexLeetDev/CS230_DrawIt_GameApp)
![Platform](https://img.shields.io/badge/platform-multi--platform-blue)
![Java](https://img.shields.io/badge/language-Java-orange)
![JDK](https://img.shields.io/badge/JDK-17-blue)
![Eclipse](https://img.shields.io/badge/IDE-Eclipse-purple)

## Project Overview

The **Draw It or Lose It** project is a web-based, multi-platform expansion of an original Android game developed for The Gaming Room. This project aims to enhance accessibility by making the game available across multiple platforms, including desktop and mobile browsers, while maintaining a real-time, team-based puzzle experience. This README provides an outline of the project, descriptions of key code files, and highlights from the CS 230 Project Three document to support understanding and implementation.

## Table of Contents

## UML Class Diagram

The following is the UML Class Diagram for the **Draw It or Lose It** project, illustrating relationships and responsibilities of each class.

![UML Class Diagram](https://github.com/AlexLeetDev/CS230_DrawIt_GameApp/blob/main/Assets/CS-230_Project_One_UML_LEET.png)

## Code Files Overview

| File                | Description                                                                      |
|---------------------|----------------------------------------------------------------------------------|
| `Entity.java`       | Base class with common attributes (`id` and `name`) for games, teams, players.   |
| `Game.java`         | Manages multiple teams within a game instance.                                   |
| `Team.java`         | Represents a team containing multiple players.                                   |
| `Player.java`       | Models individual players within a team.                                         |
| `GameService.java`  | Uses Singleton pattern to control a single game instance.                        |
| `ProgramDriver.java`| Entry point for initializing and running the game.                               |

For detailed descriptions of each code file, refer to the [Code Details Document](Assets/code-details.md).

## Software Design Document

The **Software Design Document** created for the **Draw It or Lose It Game Expansion** outlines essential details regarding the design, architecture, requirements, and platform considerations necessary for expanding the game from an Android-only application to a web-based, multi-platform experience. This document is instrumental in ensuring that the game remains accessible, secure, and scalable across various devices.

### Key Sections

1. **Executive Summary**:
   - Provides an overview of The Gaming Room’s request to expand **Draw It or Lose It** from an Android-only game to a multi-platform web-based application.
   - Highlights the goals of increasing accessibility and engagement by enabling players to join on various devices (desktop, mobile, etc.).

2. **Requirements**:
   - **Cross-Platform Compatibility**: Ensures compatibility with major platforms, including Windows, Mac, Linux, iOS, and Android.
   - **Real-Time Performance**: Emphasizes the importance of seamless real-time updates for a smooth player experience.
   - **Security**: Details secure communication protocols to safeguard player data and game state.

3. **Design Constraints**:
   - **Platform Compatibility**: Considers adjustments needed to support multiple operating systems and browsers.
   - **User Interface Flexibility**: Emphasizes responsive design to ensure usability on both desktops and mobile devices.
   - **Licensing and Development Costs**: Balances cost-efficiency with platform licensing requirements (e.g., Apple Developer fees for iOS deployment).

4. **System Architecture**:
   - Describes the application’s **three-tier architecture**:
     - **Client Tier**: Manages user interactions and interfaces.
     - **Server Tier**: Controls core game logic, user actions, and real-time updates.
     - **Data Tier**: Stores game data (e.g., players, teams) to ensure consistent gameplay across sessions.

5. **Domain Model**:
   - Provides an object-oriented domain model with classes such as `Entity`, `GameService`, `Game`, `Team`, and `Player`.
   - Includes an overview of how these classes interact, contributing to a cohesive game design that supports team-based play.

6. **Platform Evaluation**:
   - Compares various platforms (Linux, Windows, iOS, and Android) for hosting the game.
   - **Recommendation**: Linux is selected as the preferred platform due to its scalability, performance, and cost-effectiveness.

7. **Final Recommendations**:
   - **Operating Platform**: Linux for server hosting.
   - **Security**: HTTPS for secure data transmission, with potential authentication protocols like OAuth or JWT.
   - **Scalability**: Suggests distributed load balancing to handle increased traffic and ensure consistent performance.

### Access the Full Document

For an in-depth understanding, view the complete **Software Design Document** [here](https://github.com/AlexLeetDev/CS230_DrawIt_GameApp/blob/main/Assets/CS230_7-1_Project_Three_LEET.docx).

