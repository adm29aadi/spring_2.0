package com.example.demo.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
       GamingConsole game;
       public GameRunner(GamingConsole game)
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
