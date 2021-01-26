//Created by Evan O'Suilleabhain
//Input what note you want to hear and you will hear it!

import java.util.*;
public class EnterNote
{
    public static void main(String[] args)
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What note do you want to play? ");
        switch(kbReader.next()) {
            case "B":
            case "b":
                SimpleSound b = new SimpleSound(59);            //Plays the B4 note.
                b.setVisible(true);
                break;
            case "A":
            case "a":
                SimpleSound a = new SimpleSound(57);            //Plays the A4 note.
                a.setVisible(true);
                break;
            case "G":
            case "g":
                SimpleSound g = new SimpleSound(55);            //Plays the G4 note.
                g.setVisible(true);                             
                break;
            case "F":
            case "f":
                SimpleSound f = new SimpleSound(53);            //Plays the F4 note.
                f.setVisible(true);
                break;
            case "E":
            case "e":
                SimpleSound e = new SimpleSound(52);            //Plays the E4 note.
                e.setVisible(true);
                break;
            case "D":
            case "d":
                SimpleSound d = new SimpleSound(50);            //Plays the D4 note.
                d.setVisible(true);
                break;
            case "C":
            case "c":
                SimpleSound c = new SimpleSound(48);            //Plays the C4 note.
                c.setVisible(true);
                break;
        }        
        kbReader.close();        
    }
}

//It seems like the first variable controls the note/pitch, while the second variable controls volume.
//It also seems like, if you want to make a chord, Note1 and Note2 should be 15 apart.