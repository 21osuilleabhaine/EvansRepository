import java.util.*;
public class Tester {
    public static void main(String args[])
    {
        SimpleSound note = new SimpleSound();
        Scanner kbReader = new Scanner(System.in);
        while(true)
        {
            switch(kbReader.next()) {
                case "B":
                case "b":                                
                    note.makeASound(59);        //Plays the B4 note.
                    break;
                case "A":
                case "a":                                
                    note.makeASound(57);        //Plays the A4 note.
                    break;
                case "G":
                case "g":                                
                    note.makeASound(55);        //Plays the G4 note.
                    break;
                case "F":
                case "f":                                
                    note.makeASound(53);        //Plays the F4 note.
                    break;
                case "E":
                case "e":                   
                    note.makeASound(52);        //Plays the E4 note.
                    break;
                case "D":
                case "d":                    
                    note.makeASound(50);        //Plays the D4 note.
                    break;
                case "C":
                case "c":                                
                    note.makeASound(48);        //Plays the C4 note.
                    break;
                case "H":
                case "h":
                    note.makeASound(43);
                    break;
                case "Cfifth":
                    note.makeAFifth(48);        //Plays a C major fifth chord.
                    break;
            }
        }
    }
}