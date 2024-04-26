package com.example.demo.game;

public class MarioGame implements GamingConsole{
	 public MarioGame(){
		System.out.println("MarioGame running!");
	}
      public void up() {
    	  System.out.println("jump");
      }
      
      public void down() {
    	  System.out.println("go inside a Banker");
      }
      
      public void left() {
    	  System.out.println("get back to your previous position");
      }
      
      public void right() {
    	  System.out.println("move forward to nect position");
      }
}
