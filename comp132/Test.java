public class Test{
    public static void main(String[] args){
    Lab4.endGameDisplay(true);
    System.out.println();
    Lab4.endGameDisplay(false);
    
        String test1 = "       🍎 Apple";
    String test = "          ⭐Star";
    int count= 0;
count(test1);
count(test);   
    
}
public static void count(String a){
    int count = 0;
    for(int i = 0; i < a.length(); i++){
        count++;
    }
    System.out.println();
    System.out.println(count);
}
}