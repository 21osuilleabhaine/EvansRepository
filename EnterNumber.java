//Created by Evan O'Suilleabhain
//Input the MIDI number of the note you want to hear and you will hear it!

import java.util.*;
public class EnterNumber
{
    public static void main(String[] args)
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What note do you want to play? ");
        SimpleSound a = new SimpleSound(kbReader.nextInt());        //Plays the note that corresponds to each MIDI number (starting with G4 at 55 and moving 
        a.setVisible(true);                                         //one piano key up and down per number).
        kbReader.close();                                                                            
    }
}