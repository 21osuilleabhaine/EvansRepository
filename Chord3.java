import java.util.*;
public class Chord3
{
    public static void main(String args[])
    {
        SimpleSound note = new SimpleSound();
        Scanner kbReader = new Scanner(System.in);
        while(true)
        {
            note.makeAChord3(kbReader.nextInt());
        }
    }
}
