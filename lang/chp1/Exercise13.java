class Exercise13 {


    static void cramersLaw(double a,double b,double e,double c,double d,double f){
        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("Where x = " + x);
        System.out.println("Where y = " + y);   
    }

    public static void main(String[] args){
        System.out.println("3.4x + 50.2y = 44.5\n"
                        +  "2.1x + 0.55y = 5.9");
        System.out.println();
        cramersLaw(3.4,50.2,44.5,2.1,0.55,5.9);
    }
}