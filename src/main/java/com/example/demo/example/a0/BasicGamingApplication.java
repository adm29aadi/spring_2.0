package com.example.demo.example.a0;

import com.example.demo.game.GameRunner;
import com.example.demo.game.MarioGame;
import com.example.demo.game.SuperContra;

public class BasicGamingApplication {
   public static void main(String args[]) {
	      //var game = new MarioGame();
	      SuperContra game = new SuperContra();
	      GameRunner gamerunner = new GameRunner(game);
	      System.out.println("my name is adarsh");
	      gamerunner.run();
   }
}
