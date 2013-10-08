/**
 * Assignment #1, Computer Science 1026A
 * Marko Karac 250758950
 * October 9th 2013
 * 
 * Simple program that demonstrates basic programming to draw shapes
 */

import java.awt.Color;
public class TurtleArt
{
  public static void main(String [] args)  
  {
    //creating a 2d world that can hold turtles and display them
    World world = new World(false);
    
    //creating 2d turtle
    Turtle t = new Turtle(world);
    Turtle t2 = new Turtle(world);
    Turtle t3 = new Turtle(world);

    //creating variables that are holding the dimentions for the house
    int width = 250;
    int height = 150;
    int windowWidth = 30;
    int doorWidth = 30;
    int doorHeight = 50;
    int initialY = t.getYPos();
    int grassX = 0;
    int grassY = 479;
    int grassPenWidth = 175;
    int grassPenLength = 639;
    int rectanglePenWidth = 5;
    int garagePenWidth = 5;
    int equialateralRoofPenWidth = 3;
    int equialaterTopOfDoor = 2;
    int garageWidth = height/2;
    
    //Turtle t2 creates green grass
    t2.penUp();
    t2.moveTo(grassX,grassY);
    t2.turnRight();
    t2.setPenWidth(grassPenWidth);
    t2.setPenColor(java.awt.Color.GREEN);
    t2.penDown();
    t2.forward(grassPenLength);
    
    //Turtle t create a rectangular house foundation 
    t.setPenColor(java.awt.Color.BLACK);
    t.setPenWidth(rectanglePenWidth);
    t.drawRectangle(width, height);
    
    //Turtle t moved and creates a Equilateral roof
    t.penUp();
    t.turn(30);
    t.forward(width);
    t.turn(-30);
    t.penDown();
    t.setPenWidth(equialateralRoofPenWidth);
    t.drawEquilateral(width);
    t.penUp();
   
    //Turtle t creates the first right window
    t.turn(150);
    t.forward(width);
    t.turn(30);
    t.forward(height/4);
    t.turn(90);
    t.forward(width/4);
    t.turn(90);
    t.penDown();
    t.setPenWidth(3);
   
    //Turlte t changes color of window to red
    t.setPenColor(java.awt.Color.RED);
    t.drawSquare(windowWidth);
    t.penUp();
    
    //move Turtl t to the top left of the left window

    t.moveTo(t.getXPos() - width/2 - windowWidth, t.getYPos());
    
    //Turtle t creates left window
    t.penDown();
    t.setPenColor(java.awt.Color.RED);
    t.drawSquare(windowWidth);
    t.penUp();
    
    //Turtle t is moved to the top left of the door and creates it
    t.moveTo(t.getXPos() + doorWidth/2 + width/4, initialY + height - doorHeight);
    t.penDown();
    t.drawRectangle(doorWidth,doorHeight);
    t.penUp();
    
    //Turtle t moves to top left of the door and creates an equilater door accent
    t.turn(30);
    t.forward(doorWidth);
    t.turn(-30);
    t.penDown();
    t.setPenWidth(equialaterTopOfDoor);
    t.setPenColor(java.awt.Color.YELLOW);
    t.drawEquilateral(doorWidth);
    t.penUp();
  
    //Turtle t3 creates garage
    t3.penUp();
    t3.moveTo(t3.getXPos() - garageWidth, t3.getYPos() + height/2);
    t3.penDown();
    t3.setPenColor(java.awt.Color.BLACK);
    t3.setPenWidth(garagePenWidth);
    t3.drawSquare(garageWidth);

    //this hides the 2d turtles and shows the 2d world
    t.hide();
    t2.hide();
    t3.hide();   
    world.show();
   
 }
    
  
  
 
  
}