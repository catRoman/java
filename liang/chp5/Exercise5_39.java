

public class Exercise5_39{
    public static void main(String[] args){
        
        final int COMMISION_SOUGHT = 25000;
        double saleTotal = 0.01;
        double commision = 0;
        do{
            commision = 0;
            if(saleTotal > 0 && saleTotal < 5000){
                commision = (saleTotal * 0.08);
            }
            if(saleTotal > 5000 && saleTotal < 10000){
                commision += ((saleTotal - 5000) * 0.10);
            }
            if(saleTotal > 10000){
                commision += ((saleTotal - 10000) * 0.12);
            }
            saleTotal += 0.01;
        } while(commision < COMMISION_SOUGHT);

        commision = (int)(Math.round(commision * 100)) / 100.0;
        saleTotal = (int)(Math.round(saleTotal * 100)) / 100.0;
        System.out.println("commision sought:" + COMMISION_SOUGHT);
        System.out.println("commission: " + commision);
        System.out.println("sales Total: " + saleTotal);
    }
}