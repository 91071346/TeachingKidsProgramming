package org.teachingkidsprogramming.section07objects;

import org.teachingkidsprogramming.recipes.quizzes.graders.SpiderQuiz;
import org.teachingkidsprogramming.recipes.quizzes.graders.SpiderWebQuizGrader;
public class circleAround
public class SpiderWebQuiz extends SpiderQuiz
{
  @Override
  public void question1()
  {
    for (int i = 0; i < number; i++)
    {
      circle();
    }
  }
  public void question2()
  {
    //      Create and then call a recipe called circleAround which 
    {
     for (int i = 0; i < 3; i++)
    {
      adjust();
      circle();
    } 
    }
    //      Does the following 3 times
    //      Call adjust()
    //      Call question1
    //      Repeat
  }
  public void question3()
  {
    //      Create and then call a recipe called grow which 
    //      Changes the current length so it is multiplied by 2.5
  }
  public void question4()
  {
    //      Create and then call a recipe called shrink which 
    //      Decreases the current length by 9 pixels
  }
  public void question5()
  {
    //      Create and then call a recipe called expand which
    //      Increases the current number by 12
  }
  public static void main(String[] args)
  {
    new SpiderWebQuizGrader().grade(new SpiderWebQuiz());
  }
}
