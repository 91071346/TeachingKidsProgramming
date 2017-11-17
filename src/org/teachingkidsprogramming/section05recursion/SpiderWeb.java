package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    Change the width of the line the tortoise draws to 1 pixel --#12
    //    Change the Tortoise to a Spider --#14
    //    Change the pen color of the line the tortoise draws to red --#13.1
    //    Set the color of the background window to black (HINT: use the Tortoise to get the background window) --#13.2
    Double length = 10.5;
    //    The current zoom is 1.1 --#8.2
    Double zoom = 1.1;
    //    Do the following 10 times --#10.1
    //        weaveOneLayer (recipe below) --#9.1
    //
    //        ------------- Recipe for weaveOneLayer --#9.2
    for (int i = 0; i < 6; i++)
    {
      //
      drawTriangle(length);
      //
      Tortoise.turn(360 / 6);
      //            Increase the current length (of the line) by the current zoom --#8.1
    }
    //        ------------- End of weaveOneLayer recipe --#9.3
    //
    zoom = zoom * 1.3;
    //    End Repeat --#10.2
  }
  private static void drawTriangle(Double length)
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3);
    }
  }
}
