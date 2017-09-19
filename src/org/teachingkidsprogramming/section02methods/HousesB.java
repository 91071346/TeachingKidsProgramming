package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class HousesB
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(0);
    int height = 40;
    drawHouseFlatRoof(height);
    drawHousePointyRoof(140);
    drawHouseSlantedRoof(50);
    drawHouseFlatRoof(20);
    drawHousePointyRoof(100);
    drawHousePointyRoof(140);
    drawHouseFlatRoof(100);
    drawHouseFlatRoof(30);
    drawHousePointyRoof(160);
    drawHouseSlantedRoof(50);
  }
  //define a method called drawHouseSlantedRoof
  //define a method called drawSlantedRoof
  private static void drawSlantedRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(30);
    Tortoise.turn(45);
  }
  private static void drawHouseSlantedRoof(int height)
  {
    Tortoise.setPenColor(PenColors.getRandomColor());
    Tortoise.move(height);
    drawSlantedRoof();
    Tortoise.turn(90);
    Tortoise.move(height + 20);
    Tortoise.turn(-90);
  }
  private static void drawHousePointyRoof(int height)
  {
    Tortoise.setPenColor(PenColors.getRandomColor());
    Tortoise.move(height);
    drawHousePointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHousePointyRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(90);
    Tortoise.move(15);
    Tortoise.turn(45);
  }
  private static void drawHouseFlatRoof(int height)
  {
    Tortoise.setPenColor(PenColors.getRandomColor());
    Tortoise.move(height);
    drawFlatRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawFlatRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
