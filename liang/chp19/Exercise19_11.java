public class Exercise19_11{
    public static void main(String[] args){
        Complex[][] m1 = new Complex[][]{
            {new Complex(1.1,2.2), new Complex(4.2,5.6),new Complex(6.3,1.0)},
            {new Complex(2.4,-5.6), new Complex(3.5,-5.2), new Complex(6.0 ,8.9)},
            {new Complex(7.6,2.0) , new Complex(5.0,8.0) , new Complex(3.0,4.0)}};

            Complex[][] m2 = new Complex[][]{
                {new Complex(6.1,-2.1), new Complex(4.2,-5.6),new Complex(5.2,1.6)},
                {new Complex(2.4,7.8), new Complex(-3.5,-5.2), new Complex(6.3 ,3.9)},
                {new Complex(7.5,-6.0) , new Complex(5.0,-8.0) , new Complex(8.0,7.0)}};
        

        ComplexMatrix complexMatrix = new ComplexMatrix();

        System.out.println("\nm1 + m2:");
        ComplexMatrix.printResult(m1, m2, complexMatrix.addMatrix(m1, m2), '+');

        System.out.println();
        System.out.println("m1 * m2:");
        ComplexMatrix.printResult(m1, m2, complexMatrix.multiplyMatrix(m1,m2), '*');
        }
}