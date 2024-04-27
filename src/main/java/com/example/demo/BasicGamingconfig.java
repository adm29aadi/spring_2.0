package com.example.demo;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GamingConsole;
import com.example.demo.game.MarioGame;

@SpringBootConfiguration
public class BasicGamingconfig {
@Bean 
public GamingConsole game() {
		var game1 = new MarioGame();
		return game1;
	}
@Bean
public GameRunner gamerunner() {
	return new GameRunner(game());
}
}
