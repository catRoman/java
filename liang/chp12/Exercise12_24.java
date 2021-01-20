import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise12_24{
    public static void main(String[] args)
        throws IOException{
            createSalaryListFile("Salary.txt");
        }
    public static ArrayList<String> getName(String fileName)
        throws IOException{
            ArrayList<String> nameList = new ArrayList<>();
            File file = new File(fileName);

            try(Scanner nameListScan = new Scanner(file)){
                while(nameListScan.hasNext()){
                    nameList.add(nameListScan.nextLine());
                }
            }
            return nameList;
        }
    public static String randomName(ArrayList<String> nameList){
        int randomIndex = (int)(Math.random() * nameList.size()); 
        return nameList.get(randomIndex);
    }
    public static int randomRank(){
        return (int)(Math.random() * 3);
    }
    public static String getRank(int rankIndex){
        switch(rankIndex){
            case 0: return "assistant";
            case 1: return "associate";
            case 2: return "full";
        }
        return "Error";
    }
    public static double getSalary(int rankIndex){
       double salary =0;
     
        switch(rankIndex){
            case 0:{
                
                salary = (Math.random() * (80000 - 50000))+ 50000;
            } 
            case 1:{
                salary = (Math.random() * (110000 - 60000)) + 60000;
            } 
            case 2:{
                salary = (Math.random() * (130000 - 75000)) + 75000;
            }
            
        }
        return Math.round(salary * 100)/100.0;
    }
    public static String[] createSalaryList()
        throws IOException{
        String[] salaryList = new String[1000];
        int rank = -1;
        for(int i = 0; i < salaryList.length; i++){
            rank = randomRank();
            salaryList[i] = randomName(getName("firstNameList.txt")) 
                            + (i + 1) + " " 
                            + randomName(getName("lastNameList.txt"))
                            + (i+1) + " " 
                            + getRank(rank) + " "
                            + getSalary(rank);
        }
        return salaryList;
    }
    public static void createSalaryListFile(String fileName)
        throws IOException{

            File salaryFile = new File(fileName);
            try(PrintWriter output = new PrintWriter(salaryFile)){
                for(String e : createSalaryList()){
                    output.println(e);
                }
            }

    }
}