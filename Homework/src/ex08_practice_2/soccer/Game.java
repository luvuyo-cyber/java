/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex08_practice_2.soccer;

import ex08_practice_2.utility.GameUtils;

/**
 *
 * @author Administrator
 */
public class Game {
    
    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;
    
    public void playGame() {
        /*
        Generates a random number of goals (0 to 6)
        Creates an array of Goal objects with that size
        Assigns this array to the goals field
        Calls GameUtils.addGameGoals(this) to populate the goals
        */
        int numberOfGoals = (int)(Math.random() * 7);
        Goal[] theGoals = new Goal[numberOfGoals];
        this.goals = theGoals;
        GameUtils.addGameGoals(this);        
    }
    
    public String getDescription() {
        /*
        Uses a StringBuilder to construct a description of the game
        Iterates through all goals, adding details of each to the description
        Returns the complete description as a String
        */
        StringBuilder returnString = new StringBuilder();
        for (Goal currGoal: this.goals) {
            returnString.append("Goal scored after "
            + currGoal.theTime + " mins by "
            + currGoal.thePlayer.playerName + " of "
            + currGoal.theTeam.teamName +
              "\n");
        }
        return returnString.toString();
    }
      
}
