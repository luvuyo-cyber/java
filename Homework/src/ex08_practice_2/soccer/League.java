/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex08_practice_2.soccer;


/**
 *
 * @author Administrator
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instead of manually creating a goal, the code now calls a playGame() method on the Game object.
        // After the game is played, it calls a getDescription() method to get and print the game's description.

        Team[] theTeams = createTeams();
        Game[] theGames = createGames(theTeams);

        Game currGame = theGames[0];
        
        currGame.playGame();
        
        System.out.println(currGame.getDescription());

    }

    public static Team[] createTeams() {

        Player player1 = new Player();
        player1.playerName = "George Eliot";
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";
        Player[] thePlayers = {player1, player2, player3};

        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;

        // Create team2
        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";

        Team[] theTeams = {team1, team2};
        return theTeams;
    }

    public static Game[] createGames(Team[] theTeams) {
        Game theGame = new Game();
        theGame.homeTeam = theTeams[0];
        theGame.awayTeam = theTeams[1];
        Game[] theGames = {theGame};
        return theGames;
    }

}

/*
Encapsulation:
The game logic is now encapsulated within the Game class.
The League class doesn't need to know how the game is played or how goals are scored.

Abstraction:
The main method now works at a higher level of abstraction.
It doesn't deal with the details of goal scoring, but simply tells the game to play and then asks for a description.
*/