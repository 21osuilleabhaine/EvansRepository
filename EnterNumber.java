import java.util.*;
public class EnterNumber
{
    public static void main(String[] args)
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What note do you want to play? ");
        SimpleSound a = new SimpleSound(kbReader.nextInt());
        a.setVisible();
        kbReader.close();        
    }
}