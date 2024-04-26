package com.example.demo.game;

public class GameRunner {
       MarioGame game;
       public GameRunner(MarioGame game)
       {
    	   this.game=game;
       }
       public void run() {
    	   game.up();
    	   game.down();
    	   game.left();
    	   game.right();
       }
}
