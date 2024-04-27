package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GamingConsole;
//import com.example.demo.game.MarioGame;
//import com.example.demo.game.SuperContra;
@Configuration
@ComponentScan("com.example.demo.game")
public class BasicGamingApplication {

public static void main(String args[]) {
	      try (var context = new AnnotationConfigApplicationContext(BasicGamingApplication.class)) {
			//context.getBean(GamingConsole.class).up();
			  //x.up();
	    	 context.getBean(GamingConsole.class);
	    	 context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      //var context1 = new AnnotationConfigApplicationContext(BasicGamingconfig.class);
	      //
   }

}
