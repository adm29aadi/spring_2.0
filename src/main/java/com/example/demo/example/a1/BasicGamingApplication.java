package com.example.demo.example.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.demo.game.GameRunner;
import com.example.demo.game.MarioGame;
import com.example.demo.game.SuperContra;



@Component
class singleton_class{
	
	
}

@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class prototype_class{
	   
}


@Configuration
@ComponentScan
public class BasicGamingApplication {
   public static void main(String args[]) {
	   System.out.println("BasicGamingApplication invoked");
	     var context = new AnnotationConfigApplicationContext(BasicGamingApplication.class);
	     System.out.println(context.getBeansOfType(singleton_class.class));
	     System.out.println(context.getBeansOfType(singleton_class.class));
	     System.out.println(context.getBeansOfType(singleton_class.class));
	     System.out.println(context.getBeansOfType(singleton_class.class));
	     
	     System.out.println("prototype_class");
	     
	     
	     System.out.println(context.getBeansOfType(prototype_class.class));
	     System.out.println(context.getBeansOfType(prototype_class.class));
	     System.out.println(context.getBeansOfType(prototype_class.class));
	     
   }
}
