package org.teachingkidsprogramming.section07objects;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Turtle;

public class SuperTurtles
{
  public MultiTurtleWindow mtw = new MultiTurtleWindow();
  public SuperTurtles()
  {
    showSomeTurtles();
  }
  public static void main(String[] args)
  {
    new SuperTurtles();
  }
  private void showSomeTurtles()
  {
    makeSpeedyTurtle();
    makeSlowTurtle();
    makeCrazyTurtle();
  }
  private void makeCrazyTurtle()
  {
    Turtle makeCrazyTurtle = new Turtle();
    mtw.addAndShowTurtle(makeCrazyTurtle);
    makeCrazyTurtle.drawLightning(55);
  }
  private void makeSlowTurtle()
  {
    Turtle makeSlowTurtle = new Turtle();
    mtw.addAndShowTurtle(makeSlowTurtle);
    makeSlowTurtle.drawTriangle(-50);
  }
  private void makeSpeedyTurtle()
  {
    Turtle speedyTurtle = new Turtle();
    mtw.addAndShowTurtle(speedyTurtle);
    speedyTurtle.setSpeed(10);
    speedyTurtle.drawTriangle(100);
  }
}
