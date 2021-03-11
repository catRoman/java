package gameObjects;

import collections.LinkedQueue;
/**
 * Collection of in game art
 */
public class AsciiArt {
    /**
     * nor arg constructor
     */
    public AsciiArt(){}

    /**
     * A ascii art display of "you won"
     * @return a string containing "you won" in ascii art
     */
    public static String win(){
        String won = "" 
        + "$$\\     $$\\                         $$\\      $$\\                     $$\\ $$\\      \n"
        + "\\$$\\   $$  |                        $$ | $\\  $$ |                    $$ |$$ |        \n"
        + " \\$$\\ $$  /$$$$$$\\  $$\\   $$\\       $$ |$$$\\ $$ | $$$$$$\\  $$$$$$$\\  $$ |$$ |   \n"
        + "  \\$$$$  /$$  __$$\\ $$ |  $$ |      $$ $$ $$\\$$ |$$  __$$\\ $$  __$$\\ $$ |$$ |      \n"
        + "   \\$$  / $$ /  $$ |$$ |  $$ |      $$$$  _$$$$ |$$ /  $$ |$$ |  $$ |\\__|\\__|        \n"
        + "    $$ |  $$ |  $$ |$$ |  $$ |      $$$  / \\$$$ |$$ |  $$ |$$ |  $$ |                  \n"
        + "    $$ |  \\$$$$$$  |\\$$$$$$  |      $$  /   \\$$ |\\$$$$$$  |$$ |  $$ |$$\\ $$\\      \n" 
        + "    \\__|   \\______/  \\______/       \\__/     \\__| \\______/ \\__|  \\__|\\__|\\__| \n";
                                                                             
                                                                             
       return won;                                                                      


    }
    /**
     * A ascii art display of "you lost"
     * @return a string containing "you lost" in ascii art
     */
    public static String loss(){
        String loss = ""

      + " __      __                         __                              __     __  __  \n"
      + "/  \\    /  |                       /  |                            /  |   /  |/  | \n"
      + "$$  \\  /$$/______   __    __       $$ |        ______    _______  _$$ |_  $$ |$$ | \n"
      + " $$  \\/$$//      \\ /  |  /  |      $$ |       /      \\  /       |/ $$   | $$ |$$ | \n"
      + "  $$  $$//$$$$$$  |$$ |  $$ |      $$ |      /$$$$$$  |/$$$$$$$/ $$$$$$/  $$ |$$ | \n"
      + "   $$$$/ $$ |  $$ |$$ |  $$ |      $$ |      $$ |  $$ |$$      \\   $$ | __$$/ $$/  \n"
      + "    $$ | $$ \\__$$ |$$ \\__$$ |      $$ |_____ $$ \\__$$ | $$$$$$  |  $$ |/  |__  __  \n"
      + "    $$ | $$    $$/ $$    $$/       $$       |$$    $$/ /     $$/   $$  $$//  |/  | \n"
      + "    $$/   $$$$$$/   $$$$$$/        $$$$$$$$/  $$$$$$/  $$$$$$$/     $$$$/ $$/ $$/  \n";
                                                                                          

        return loss;
    }
    /**
     * A ascii art display of "Comp139 Battle Royal"
     * @return a string containing "Comp139 Battle Royal" in ascii art
     */
    public static String introTitle(){
        String title = ""
        + "   ____                        _ _____ ___\n"
        + "  / ___|___  _ __ ___  _ __   / |___ // _ \\\n"
        + " | |   / _ \\| '_ ` _ \\| '_ \\  | | |_ \\ (_) |\n"
        + " | |__| (_) | | | | | | |_) | | |___) \\__, |\n"
        + "  \\____\\___/|_| |_| |_| .__/  |_|____/  /_/\n"
        + "  ____        _   _   |_|      ____                   _\n"
        + " | __ )  __ _| |_| |_| | ___  |  _ \\ ___  _   _  __ _| |\n"
        + " |  _ \\ / _` | __| __| |/ _ \\ | |_) / _ \\| | | |/ _` | |\n"
        + " | |_) | (_| | |_| |_| |  __/ |  _ < (_) | |_| | (_| | |\n"
        + " |____/ \\__,_|\\__|\\__|_|\\___| |_| \\_\\___/ \\__, |\\__,_|_|\n"
        + "                                          |___/\n";
        
        return title;
    }
    /**
     * A ascii art display of "vs"
     * @return a linkedQueue of String allowing for more functioality
     * such as mergeing images and individual line formatting
     */
    public static LinkedQueue<String> vsText(){
        LinkedQueue<String> vs = new LinkedQueue<>();
                    
            
vs.enqueue("__   _____     "); 
vs.enqueue("\\ \\ / / __|  ");
vs.enqueue(" \\ V /\\__ \\");
vs.enqueue("  \\_/ |___/   ");

return vs;
            
    }
    /**
     * A ascii art display of a queen
     * @return a linkedQueue of String allowing for more functioality
     * such as mergeing images and individual line formatting
     */
    public LinkedQueue<String> getQueen(){
        LinkedQueue<String> queen = new LinkedQueue<>();
        
        queen.enqueue("    @@@                   ");
        queen.enqueue("   // \\                  ");
        queen.enqueue("  / \\_/ \\               ");
        queen.enqueue(" / ./_(-.\\               ");
        queen.enqueue("( /      \\               ");
        queen.enqueue(" )|| @/ // )              ");
        queen.enqueue("/  @>@<@/ (               ");
        queen.enqueue("'-.;)@\\ \\.-'            ");
        queen.enqueue("   |    |                 ");
        queen.enqueue("   |    |                 ");
        queen.enqueue("   |    |                 ");
        queen.enqueue("   |    `'.               ");
        queen.enqueue("   |        `'-.          ");
        queen.enqueue("   /           '-..       ");
        queen.enqueue("   |          . .. '-...  ");
        queen.enqueue("   |.' .' .'.'..;.--'--.-'");
        queen.enqueue("    `\"-----'\"`          ");


      return queen;
    }
    /**
     * A ascii art display of a king
     * @return a linkedQueue of String allowing for more functioality
     * such as mergeing images and individual line formatting
     */
    public LinkedQueue<String> getKing(){
       LinkedQueue<String> king = new LinkedQueue<>();

      king.enqueue("  .  +  .        ");
      king.enqueue(" (^\\/^\\/^)           ");
      king.enqueue("  \\@*@*@/       ");
      king.enqueue("  {_____}        ");
      king.enqueue(" ///\"\"\"\\\\\\          ");
      king.enqueue(" (/6   6\\)      ");
      king.enqueue("  ||=^=||        ");
      king.enqueue("  \\\\\\ ///              ");
      king.enqueue("   \\\\///               ");
      king.enqueue("    `)/          ");

        return king;
    }
    /**
     * A ascii art display of a knight
     * @return a linkedQueue of String allowing for more functioality
     * such as mergeing images and individual line formatting
     */
    public LinkedQueue<String> getKnight(){
       LinkedQueue<String> knight = new LinkedQueue<>();
        knight.enqueue(",^.                     ");
        knight.enqueue("|||                     ");
        knight.enqueue("|||       _T_           ");
        knight.enqueue("|||   .-.[:|:].-.       ");
        knight.enqueue("===_ /\\|  \"'\"  |/            ");
        knight.enqueue(" E]_|\\/ \\--|-|''''|           ");
        knight.enqueue(" O  `'  '=[:]| A  |     ");
        knight.enqueue("        /\"\"\"\"|  P |         ");
        knight.enqueue("       /\"\"\"\"\"`.__.'         ");
        knight.enqueue("      []\"/\"\"\"\\\"[]         ");
        knight.enqueue("      | \\     / |              ");
        knight.enqueue("      | |     | |       ");
        knight.enqueue("    <\\\\\\)     (///>          ");
        
        return knight;
    }
    /**
     * A ascii art display of a troll
     * @return a linkedQueue of String allowing for more functioality
     * such as mergeing images and individual line formatting
     */
    public LinkedQueue<String> getTroll(){
        LinkedQueue<String> troll = new LinkedQueue<>();
             troll.enqueue("               _________           ");
             troll.enqueue("              |#########|          ");
             troll.enqueue("              |#########|          ");
             troll.enqueue("              |#########|          ");
             troll.enqueue("              |#########|          ");
             troll.enqueue("              |#########|          ");
             troll.enqueue("            __|_________|__        ");
             troll.enqueue("              |     '_ ' \\        ");
             troll.enqueue("              F     (.) (.)--.__   ");
             troll.enqueue("             /                  `. ");
             troll.enqueue("            J                    | ");
             troll.enqueue("            F       ._          .' ");
             troll.enqueue("           J          `-.____.-'   ");
             troll.enqueue("           F           \\          ");
             troll.enqueue("          J             \\         ");
             troll.enqueue("          |              \\---     ");
             troll.enqueue("          |  .  `.        \\_E     ");
             troll.enqueue("          |   `.  `.       L       ");
             troll.enqueue(" ,,,      |     `.  `.     |       ");
             troll.enqueue("\\VVV'     |       `.  `    |      ");
             troll.enqueue(" \\W|      J         ```    F      ");
             troll.enqueue("  `.    .' \\              /\\     ");
             troll.enqueue("    `--'    )    ____.-  '         ");
             troll.enqueue("           /    /   `.   `.  .-    ");
             troll.enqueue("          /   .'      `.   `' /    ");
             troll.enqueue("          `.  \\         `.   /    ");
             troll.enqueue("            `._|          `-'      ");
              
        return troll;
    }
    /**
     * A ascii art display of lisa
     * @return a linkedQueue of String allowing for more functioality
     * such as mergeing images and individual line formatting
     */
    public LinkedQueue<String> getLisa(){
        LinkedQueue<String> lisa = new LinkedQueue<>();

lisa.enqueue("////////////////\\\\    ");
lisa.enqueue("(((((((((((((( \\\\");
lisa.enqueue("))) ~~      ~~  (((");
lisa.enqueue("((( (*)     (*) )))");
lisa.enqueue(")))     <       (((");
lisa.enqueue("((( '\\______/`  ))) ");
lisa.enqueue(")))\\___________/((( ");
lisa.enqueue("       _) (_       ");
lisa.enqueue("      / \\_/ \\        ");
lisa.enqueue("     /(     )\\      ");
lisa.enqueue("    // )___( \\\\      ");
lisa.enqueue("    \\\\(     )//      ");
lisa.enqueue("     (       )     ");
lisa.enqueue("      |  |  |      ");
lisa.enqueue("       | | |       ");
lisa.enqueue("       | | |       ");
lisa.enqueue("      _|_|_|_      ");
lisa.enqueue("                   ");

        return lisa;
    }
}
