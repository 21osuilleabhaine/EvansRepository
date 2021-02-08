import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CreateMusic 
{
  public CreateMusic(String filename)
  {
    try
    {
      Scanner fileReader = new Scanner(new File(filename));
      while(fileReader.hasNextLine())
      {
        String line = fileReader.nextLine();
        String[] values = line.split(",");
        for(int col = 0; col < values.length; col++)
        {
          if(values[col].equals("1"))
          {
            SimpleSound s = new SimpleSound();
            s.makeASound(55);
          }
          else if(values[col].equals("2"))
          {
            SimpleSound s = new SimpleSound();
            s.makeASound(59);
          }
          else if(values[col].equals("3"))
          {
            SimpleSound s = new SimpleSound();
            s.makeASound(61);
          }
          else if(values[col].equals("4"))
          {
            SimpleSound s = new SimpleSound();
            s.makeASound(57);
          }
        }
      }
    }
    catch (FileNotFoundException e)
    {
      System.err.printf("File not found.", filename);
      System.exit(-1);
    }
  }
}