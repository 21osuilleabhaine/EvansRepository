public class Tester
{
    public static void main(String[] args)
    {
        SimpleSound a = new SimpleSound(55,70);
        a.setVisible(true);
    }
}

//It seems like the first variable controls the note/pitch, while the second variable controls volume.
//It also seems like, if you want to make a chord, Note1 and Note2 should be 15 apart.