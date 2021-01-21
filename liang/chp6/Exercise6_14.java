public class Exercise6_14{

    public static void main(String[] args){
        System.out.printf("%-10s%s","i","m(i)\n");
        for(int i =1; i <= 901; i += 100){
            System.out.printf("%-10d%1.4f\n",i,piFunction(i));
        }
    }
public static double piFunction(int yo){
  double m = 0;
    for(int i = 1;i <= yo; i++)
    m += Math.pow(-1, (i+1)) / ((2*i) - 1);
    m = m * 4;
    return m;
}
}