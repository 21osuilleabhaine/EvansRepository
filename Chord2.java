import java.util.*;
public class Chord2
{
    public static void main(String args[])
    {
        SimpleSound note = new SimpleSound();
        Scanner kbReader = new Scanner(System.in);
        while(true)
        {
            note.makeAChord2(kbReader.nextInt());
        }
    }
}
