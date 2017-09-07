package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class DoubleLoop
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setX(225);
    Tortoise.setY(150);
    Tortoise.setSpeed(10);
    //  
    ColorWheel.addColor(PenColors.Reds.Crimson);
    ColorWheel.addColor(PenColors.Reds.DarkRed);
    ColorWheel.addColor(PenColors.Reds.FireBrick);
    for (int i = 0; i < 6; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(i * 4);
      Tortoise.turn(-360 / 6);
      // 
      for (int j = 0; j < 15; j++)
      {
        Tortoise.setPenWidth(17);
        Tortoise.move(j * 8);
        Tortoise.turn(360 / 5);
      }
    }
    //  
    Tortoise.hide();
    Tortoise.getBackgroundWindow().setBackground(PenColors.Yellows.PeachPuff);
    //    Set the tortoise x position to 300 --#15.1
    //    Set the tortoise y position to 200 --#15.2
    //    Do the following 5 times --#12.1
    Tortoise.move(j * 5);
    //        Change the pen color of the line the tortoise draws to black --#14 
    Tortoise.move(25);
    //        Turn the tortoise 1/5 of 360 degrees to the right --#13  
    //    End Repeat --#12.2
    //  
  }
}
