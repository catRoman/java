class Exercise4 {
    public static void main(String[] args){
        int a = 1;
        

        System.out.println("a\ta^2\ta^3");

        while(a <= 4){
            int aSquare = a * a;
            int aCube = a * a * a;
            System.out.println(a + "\t" + aSquare + "\t" + aCube);
            a++;
        }
    }
}