public class Exercise12_4{
    public static void main(String[] args){
       try{
        Loan loan1 = new Loan(1,1,1000);
        Loan loan2 = new Loan(0,1,1000);
       }
       catch (IllegalArgumentException ex){
           System.out.println(ex);
           System.out.println();
       }
       try{
        Loan loan3 = new Loan(1, -1 ,1000);
       }
       catch (IllegalArgumentException ex){
        System.out.println(ex);
        System.out.println();
    }try{
        Loan loan4 = new Loan(1,1, 0);
    }catch (IllegalArgumentException ex){
        System.out.println(ex);
        System.out.println();
    }
       
        System.out.println("Test");
    }
}