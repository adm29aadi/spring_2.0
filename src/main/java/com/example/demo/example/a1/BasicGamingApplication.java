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

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
class main_class
{
	Dependency_class dependency_class;
	public main_class(Dependency_class dependency_class) {
		System.out.println("main_class constructor invoked");
		this.dependency_class = dependency_class;
	}
	@PostConstruct
	public void fun() {
		System.out.println("PostConstruct invoked");
		dependency_class.fun1();
	}
	@PreDestroy
	public void fun2() {
		System.out.println("pre-destroy invoked");
	}
}

@Component
class Dependency_class
{
    public void fun1() {
    	System.out.println("my name is adarsh");
    }
	public Dependency_class() {
		System.out.println("Dependency_class constructor invoked");
	}
	
}
@Configuration
@ComponentScan
public class BasicGamingApplication {
   public static void main(String args[]) {
	   System.out.println("BasicGamingApplication invoked");
	     var context = new AnnotationConfigApplicationContext(BasicGamingApplication.class);
	     //System.out.println(context.getBean(main_class.class));
	     Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
   }
}
