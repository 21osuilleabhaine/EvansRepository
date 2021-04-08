import java.util.*;
public class Fifths
{
    public static void main(String args[])
    {
        SimpleSound note = new SimpleSound();
        Scanner kbReader = new Scanner(System.in);
        while(true)
        {
            note.makeAFifth(kbReader.nextInt());
        }
    }
}