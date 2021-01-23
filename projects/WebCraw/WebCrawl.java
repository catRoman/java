import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class WebCrawl{
    public static void main(String[] args)
        throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter URL: ");
        String url = input.nextLine();
        System.out.print("Enter a word to search: ");
        String word = input.nextLine();
        crawler(url, word);
    }
    public static void crawler(String startingURL, String word)
        throws IOException{
        
            File file = new File("crawlLog.txt");
        
        
        try{
        if(!file.exists())
            file.createNewFile();
        }catch(IOException ex){
            System.out.println(ex);
        }

        
        PrintWriter output = new PrintWriter(file);
       
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();
        boolean wordFound = false;
        int count =0;
        listOfPendingURLs.add(startingURL);
        while (!wordFound && !listOfPendingURLs.isEmpty() &&
            listOfTraversedURLs.size() <= 10000){
                
                String urlString = listOfPendingURLs.remove(0);
                wordFound = wordSearch(urlString, word);
                if (!listOfTraversedURLs.contains(urlString)){
                    listOfTraversedURLs.add(urlString);
                    
                        if(wordSearch(urlString, word)){
                            System.out.println(word + " FOUND on Crawl " + count + " ----> " + urlString);
                            output.println(word + " FOUND on Crawl " + count + " ----> " + urlString);
                            output.close();
                           
                        }else{
                            System.out.println("Crawl " + count + " --> " + urlString);
                            output.println("Crawl " + count + " --> " + urlString);
                            
                        }
                        
                        count++;
                    }
                    for (String s : getSubURLs(urlString)) {
                        if (!listOfTraversedURLs.contains(s))
                            listOfPendingURLs.add(s);
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
        
        
        try{
            java.net.URL url = new java.net.URL(urlString);
            Scanner input = new Scanner(url.openStream());
         

                int current = 0;
                while (input.hasNext()) {
                    String line = input.nextLine();
                    
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
