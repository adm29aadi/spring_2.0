package com.example.demo;

import com.example.demo.game.GameRunner;
import com.example.demo.game.MarioGame;

public class BasicGamingApplication {
   public static void main(String args[]) {
	   MarioGame mariogame = new MarioGame();
	      GameRunner gamerunner = new GameRunner(mariogame);
	      System.out.println("my name is adarsh");
	      gamerunner.run();
   }
}
