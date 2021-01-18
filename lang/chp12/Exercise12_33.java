import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.File;

public class Exercise12_33{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter URL: ");
        String url = input.nextLine();
        System.out.print("Enter a word to search: ");
        String word = input.nextLine();
        crawler(url, word);
    }
    public static void crawler(String startingURL, String word){
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();
        boolean wordFound = false;
        int count =0;
        listOfPendingURLs.add(startingURL);
        while (!wordFound && !listOfPendingURLs.isEmpty() &&
            listOfTraversedURLs.size() <= 100){
                String urlString = listOfPendingURLs.remove(0);
                wordFound = wordSearch(urlString, word);
                if (!listOfTraversedURLs.contains(urlString)){
                    listOfTraversedURLs.add(urlString);
                    
                    System.out.println("Crawl " + count + " --> " + urlString);
                    count++;
                    for (String s : getSubURLs(urlString)) {
                        if (!listOfTraversedURLs.contains(s))
                            listOfPendingURLs.add(s);
                    }
                }
            }
    }
    public static boolean wordSearch(String urlString, String word){
        

        try{
            java.net.URL search = new java.net.URL(urlString);
            Scanner searchInput = new Scanner(search.openStream());
            while(searchInput.hasNext()){
                String line = searchInput.nextLine();
                if(line.toLowerCase().contains(word.toLowerCase())){
                    searchInput.close();
                    System.out.println("\"" + word + "\" was found on --> " + urlString);
                    return true;
                }
            }
            return false;
        }catch(Exception ex){
            //ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
            return false;
        }
    }
    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();
        File file = new File("htmlTest.txt");
        
        try{
            java.net.URL url = new java.net.URL(urlString);
            Scanner input = new Scanner(url.openStream());
            PrintWriter output = new PrintWriter(file);

                int current = 0;
                while (input.hasNext()) {
                    String line = input.nextLine();
                    output.println(line);
                    current = line.indexOf("http:", current);
                    while (current > 0){
                        int endIndex = line.indexOf("\"", current);
                        if(endIndex > 0){
                            list.add(line.substring(current, endIndex));
                            current = line.indexOf("http:", endIndex);
                        }
                        else
                            current = -1;
                    }
                }
            }
        catch (Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
        return list;
        
    }
}