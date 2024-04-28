package com.example.demo.example.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.example.demo.game.GameRunner;
import com.example.demo.game.MarioGame;
import com.example.demo.game.SuperContra;



@Component
class My_Buiseness{
	
	@Autowired     //field injection
	Dependency_1 d1;
	@Autowired     //field injection
	Dependency_2 d2;
	@Override
	public String toString() {
		return "using " + d1 + " and " + d2;
	}
	//@Autowired      //setters dependency injection
	//public void setD1(Dependency_1 d1) {
	//	this.d1 = d1;
	//}
	//@Autowired
	//public void setD2(Dependency_2 d2) {
		//this.d2 = d2;
	//}
	//@Autowired
	//public My_Buiseness(Dependency_1 d1, Dependency_2 d2) {
	//	System.out.println("My_Buiseness constructor invoked");
		//this.d1 = d1;
	//	this.d2 = d2;
	//}
}
@Component
class my_class{
	    @Autowired
		Dependency_1 d1;
	    @Autowired
		Dependency_2 d2;
		public String toString() {
			return "using " + d1 + " and " + d2;
		}
}
@Component
@Lazy
class Dependency_1{

	public Dependency_1() {
	 System.out.println("Dependency_1 constructor invoked");
	}
	
}

@Component
class Dependency_2{
	public Dependency_2() {
		System.out.println("Dependency_2 constructor invoked");
	}
}

@Configuration
@ComponentScan
public class BasicGamingApplication {
   public static void main(String args[]) {
	   System.out.println("BasicGamingApplication invoked");
	     var context = new AnnotationConfigApplicationContext(BasicGamingApplication.class);
	     Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	     System.out.println(context.getBean(My_Buiseness.class));
	     System.out.println(context.getBean(my_class.class));
   }
}
