public class midtermtest{
    public static void main(String[] args){
        double z = (int)99.9;
        System.out.println(z);
        System.out.println("red sunset".substring(5,8));
        for (int k =1; k < 5; k++){
            System.out.println(k + " ");
        }
        System.out.println(1 * 2 >= 2 && 2 <= 2);
        int month = 38;
        int year = month / 12;
        System.out.println(year);
        for(int i=3; i >= 1; i--){
            for(int j=1;j<=i;j++){
                System.out.print(i + " " + j + " ");
            }
            System.out.println();
        }
        //for (int k =11; k >=0; k++){
        //    System.out.println(k+ " ");
        

            int income = 4001;

            if (income > 3000){
                System.out.println("income is greater then 3000");
            }else if (income > 4000){
                System.out.println("Income is greater that 4000");
            }
    
            for (int i = 0; i <= 5; i++){
                System.out.println((int)Math.random() * 4);
            
            int x = 1;
            int y = -1;
            int z1 = 1;

                if(x>0)
                if(y>0)
                System.out.println("x > 0 and y > 0");
                else if(z1>0)
                System.out.println("x<0and z>0");
            }
        }

}