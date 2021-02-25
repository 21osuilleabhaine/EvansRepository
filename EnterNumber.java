//Created by Evan O'Suilleabhain
//Input the MIDI number of the note you want to hear and you will hear it!

import java.util.*;
public class EnterNumber
{
    public static void main(String[] args)
    {
        Scanner kbReader = new Scanner(System.in);
        SimpleSound note = new SimpleSound();                                        //Plays the note that corresponds to each MIDI number (starting with G4 at 55 and moving one piano key up and down per number).                                                                      
        while(true)
        {
            note.makeASound(kbReader.nextInt());
        }
    }
}