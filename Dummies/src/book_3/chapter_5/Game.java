package book_3.chapter_5;

import book_3.chapter_5.Playable;

public class Game implements Playable {
    @Override
    public void play() {
        System.out.println("You're now playing the game.");
    }
}
