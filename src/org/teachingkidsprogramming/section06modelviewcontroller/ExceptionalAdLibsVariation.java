package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibsVariation
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    String edverb = askEdVerb();
    String bodyPart = askBodyPart();
  }//end of main
  private static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("Enter an adverb: ");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Why are you on Earth? Try again");
      askAdverb();
    }
    else if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Brian doesn't approve, try again");
      askAdverb();
    }
    return adverb;
  }//end of method
  private static String askEdVerb()
  {
    String EdVerb = MessageBox.askForTextInput("Enter an -ed verb");
    if (EdVerb.isEmpty())
    {
      MessageBox.showMessage("You do not contain Bryan's infinitary, try again");
      askEdVerb();
    }
    else if (EdVerb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Brain can't even look at you without disgust, try again");
    }
    return EdVerb;
  }//end of main
}//end of class
