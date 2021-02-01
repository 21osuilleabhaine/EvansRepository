//Created by Evan O'Suilleabhain
//Input the letter of the note you want to hear and you will hear it!

import java.util.*;
public class EnterLetter
{
    public static void main(String[] args)
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What note do you want to play? ");
        switch(kbReader.next()) {
            case "B":
            case "b":
                SimpleSound b = new SimpleSound();            //Plays the B4 note.
                b.makeASound(59);
                break;
            case "A":
            case "a":
                SimpleSound a = new SimpleSound();            //Plays the A4 note.
                a.makeASound(57);
                break;
            case "G":
            case "g":
                SimpleSound g = new SimpleSound();            //Plays the G4 note.                             
                g.makeASound(55);
                break;
            case "F":
            case "f":
                SimpleSound f = new SimpleSound();            //Plays the F4 note.
                f.makeASound(53);
                break;
            case "E":
            case "e":
                SimpleSound e = new SimpleSound();            //Plays the E4 note.
                e.makeASound(52);
                break;
            case "D":
            case "d":
                SimpleSound d = new SimpleSound();            //Plays the D4 note.
                d.makeASound(50);
                break;
            case "C":
            case "c":
                SimpleSound c = new SimpleSound();            //Plays the C4 note.
                c.makeASound(48);
                break;
        }        
        kbReader.close();        
    }
}

//It seems like the first variable controls the note/pitch, while the second variable controls volume.
//It also seems like, if you want to make a chord, Note1 and Note2 should be 15 apart.