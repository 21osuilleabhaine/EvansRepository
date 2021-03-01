import java.util.*;

public class OdeToJoy 
{
    public static void main(String args[])
    {
        SimpleSound note = new SimpleSound();
        Scanner kbReader = new Scanner(System.in);
        while(true)
        {
            switch(kbReader.next()) {
                case "d":                                
                    note.makeASound(52);
                    break;
                case "f":                                
                    note.makeASound(53);
                    break;
                case "g":                   
                    note.makeASound(55);
                    break;
                case "s":                    
                    note.makeASound(50);
                    break;
                case "a":                                
                    note.makeASound(48);
                    break;
                case "z":
                    note.makeASound(43);
                    break;
            }
        }
    }
}