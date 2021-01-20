public class CharacterTest{
    public static void main(String[] args){
System.out.println(System.getProperty("file.encoding"));

        
        for(int i =33; i<= 1000000; i++){
            System.out.printf("%4s%8s","|" + i ,(char)i + " |");
            if(i % 10 == 0)
                System.out.println();
           
                
      
            
        }
        System.out.println();
    
}
}