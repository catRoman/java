
public class Exercise2_18 {

    public static void main(String[] args){
double a = 0;
double b = 1;

System.out.println("a\tb\tpow(a,b)");
        for(int i=1; i <= 5 ; i++){
            a++;
            b++;
            System.out.println((int)a + "\t" + (int)b + "\t" + (int)Math.pow(a,b));
}

    }
}