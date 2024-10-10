/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex07_practice_1;

/**
 *
 * @author Administrator
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Start of code that builds teams
        // Create team1      
        Player player1 = new Player();
        player1.playerName = "George Eliot";
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";
        Player[] thePlayers = {player1, player2, player3 };
        
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
        
        // End of code that builds teams
        
    
        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;
        
        System.out.println("Goal scored after " + 
                currGame.goals[0].theTime + " mins by " +
                currGame.goals[0].thePlayer.playerName + " of " +
                currGame.goals[0].theTeam.teamName);
        
        

        for (Player thePlayer: team2.playerArray) {
            //System.out.println(thePlayer.playerName);
            if (thePlayer.playerName.matches(".*Sab.*")) {
                //means "any characters, followed by 'Sab', followed by any characters".
                System.out.println("Found " + thePlayer.playerName);
                System.out.println("Last name is " + thePlayer.playerName.split(" ")[1]);
            }
        }
        
        StringBuilder familyNameFirst = new StringBuilder();
        for (Player thePlayer: team1.playerArray) {
            //This loop goes through all players in team1.
            String[] name = thePlayer.playerName.split(" ");
            //String.split(" ") divides a string into an array of substrings based on a delimiter (space in this case).
            //It splits each player's name into first and last name.
            familyNameFirst.append(name[1]);
            //It then rebuilds the name in "Last, First" format using a StringBuilder.
            familyNameFirst.append(", ");
            familyNameFirst.append(name[0]);
            System.out.println(familyNameFirst);
            //The reformatted name is printed.
            familyNameFirst.delete(0,familyNameFirst.length());
            //The StringBuilder is cleared after each player for reuse
        } 
    }   
}
