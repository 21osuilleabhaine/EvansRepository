//Created by Evan O'Suilleabhain
//Mary Had A Little Lamb! Edited for convenience to be limited to the A S and D keys.

import java.util.*;
public class MaryHadALittleLamb 
{
    public static void main(String args[])
    {
        SimpleSound note = new SimpleSound();
        Scanner kbReader = new Scanner(System.in);
        while(true)
        {
            switch(kbReader.next()) {                   //"Sheet music": ASDSAAA#SSS#AAA#ASDSAAA#SSASD
                case "a":
                    note.makeASound(59);
                    break;
                case "s":
                    note.makeASound(57);
                    break;
                case "d":
                    note.makeASound(55);
                    break;
            }
        }
    }
}