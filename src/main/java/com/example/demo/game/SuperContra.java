package com.example.demo.game;

public class SuperContra implements GamingConsole{
   public SuperContra(){
   System.out.println("supercontraGame running!");}
   public void up() {
	   System.out.println("stand up!");
   }
   
  public void down() {
	  System.out.println("sit down!");
  }
  public void left() {
	  System.out.println("move back!");
  }
  
  public void right() {
	  System.out.println("open fire!");
  }
}
