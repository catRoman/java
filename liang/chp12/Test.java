public class Test {
public static void main(String[] args) {
        int rankIndex = 0;
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
         System.out.println(Math.round(salary * 100)/100.0);
     }
    }

