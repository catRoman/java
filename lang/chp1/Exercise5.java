class Exercise5{
    public static void main(String[] args){
        double a = (9.5 * 4.5 - 2.5 * 3)/(45.5 - 3.5);
        System.out.println("This is right: " + a);
        double b = ((9.5 * 4.5)-(2.5 * 3))/(45.5 - 3.5);
        System.out.println("This is right also: " + b);
        double c = 9.5 * 4.5 - 2.5 * 3/45.5 -3.5;
        System.out.println("This is wrong...no brackets: " + c);
    }
}