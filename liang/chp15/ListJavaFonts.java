
import javafx.scene.text.Font;

public class ListJavaFonts
{

  public static void main(String[] args)
  {
    String fonts[] = 
      Font.getFamilies();

    for (String e: Font.getFamilies())
    {
      System.out.println(e);
    }
  }

}
