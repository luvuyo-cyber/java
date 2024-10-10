/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex08_practice_2.utility;

import ex08_practice_2.soccer.*;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 *
 * @author ksomervi
 */
public class GameUtils {

    /*
    This method populates the goals array of a Game object with randomly generated Goal objects.
    Key points:
    If goals is null, it initializes it with a random size (up to 9).
    For each goal, it:
    Randomly assigns it to home or away team
    Randomly selects a player from the team
    Assigns a random time (0-89 minutes)
    Finally, it sorts the goals by time.
    */
    public static void addGameGoals(Game currGame) {
        
        //System.out.println(currGame.awayTeam + " : " + currGame.homeTeam);

        // Or possibly throw an Exception?
        if (currGame.goals == null) {
            currGame.goals = new Goal[(int) (Math.random() * 10)];   // If goals not initialized max will be 9
        }

        //System.out.println(currGame.goals.length);
        int i = 0;
        for (Goal currGoal : currGame.goals) {
            currGoal = new Goal();
            currGoal.theTeam = Math.random() > 0.5 ? getHomeTeam(currGame, "home") : getHomeTeam(currGame, "away");
            currGoal.thePlayer = currGoal.theTeam.playerArray[(int) (Math.random() * currGoal.theTeam.playerArray.length)];
            currGoal.theTime = (int) (Math.random() * 90);
            currGame.goals[i] = currGoal;
            i++;
        }
        Arrays.sort(currGame.goals, (g1, g2) -> Double.valueOf(g1.theTime).compareTo(Double.valueOf(g2.theTime)));

    }

    /*
    This private method uses Java Reflection to get either the home or away team from a Game object.
    Key points:
    It first tries to use a getter method (e.g., getHomeTeam() or getAwayTeam()).
    If that fails, it tries to access a public field (e.g., homeTeam or awayTeam).
    If both fail, it prints an error message.
    */
    private static Team getHomeTeam(Game currGame, String homeOrAway) {
        Team theTeam = null;
        Method m;
        Field f;
        try {
            m = Game.class.getMethod("get" + Character.toUpperCase(homeOrAway.charAt(0)) + homeOrAway.substring(1) + "Team");
            theTeam = (Team)m.invoke(currGame);
            //System.out.println(theTeam);
        } catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException em) {
            try {
                f = Game.class.getField(homeOrAway + "Team");
                theTeam = (Team)f.get(currGame);
                //System.out.println(theTeam);
            } catch (NoSuchFieldException|IllegalAccessException ef) { 
                System.out.println("The addGoals() utility requires the Goal class to contain either:\n" +
                        "public String fields called homeTeam and awayTeam, OR,\n" +
                        "public accessor methods called getHomeTeam() and getAwayTeam().");
            }
        }
        return theTeam;
    }
}
