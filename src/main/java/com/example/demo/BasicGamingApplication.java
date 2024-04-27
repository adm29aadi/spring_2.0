package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GamingConsole;
//import com.example.demo.game.MarioGame;
//import com.example.demo.game.SuperContra;

public class BasicGamingApplication {

public static void main(String args[]) {
	      try (var context = new AnnotationConfigApplicationContext(BasicGamingconfig.class)) {
			context.getBean(GamingConsole.class).up();
			  //x.up();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      var context1 = new AnnotationConfigApplicationContext(BasicGamingconfig.class);
	      context1.getBean(GameRunner.class).run();
   }

}
