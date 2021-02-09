public abstract class GenericMatrix<E> {
    /**Abstract method for adding two elements of the matrices */
    protected abstract E add(E o1, E o2);

    /**Abstract method for mutliplyng two elements of the matrix */
    protected abstract E multiply(E o1, E o2);

    /**Abstract method for defing zero for the matrix element */
    protected abstract E zero();

    /**Add two matrix */
    @SuppressWarnings("unchecked")
    public E[][] addMatrix(E[][] matrix1, E[][] matrix2){
        //check bounds of the two matrices
        if ((matrix1.length  != matrix2.length) || 
            (matrix1[0].length != matrix2[0].length)) {
                throw new RuntimeException(
                    "The matricex do not have the same size"
                );
            }
            E[][] result = (E[][])new Object[matrix1.length][matrix1[0].length];

            //preform addition
            for(int i = 0; i< result.length; i++)
                for( int j = 0; j < result[i].length; j++) {
                    result[i][i] = add(matrix1[i][j], matrix2[i][j]);
                }
                return result;
    }
    /** Multiply two matrices */
    @SuppressWarnings("unchecked")
    public E[][] multiplyMatrix(E[][] matrix1, E[][] matrix2){
        //check bounds
        if(matrix1[0].length != matrix2.length){
            throw new RuntimeException(
                "The matrices do not have a compatible size"
            );
        }

        //create result matirx
        E[][] result =
            (E[][])new Object[matrix1.length][matrix2[0].length];

        //preform multiplication of the two matrices
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[0].length; j++){
                result[i][j] = zero();

                for(int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] = add(result[i][j],
                    multiply(matrix1[i][k], matrix2[k][j]));
                }
            }
        }
        return result;
    }

    /** Print matrices, the operator , and their operation results */
    public static void printResult(
        Object[][] m1, Object[][] m2, Object[][] m3, char op) {
            for (int i = 0; i < m1.length; i++) {
                for(int j = 0; j < m1[0].length; j++)
                    System.out.print(" " + m1[i][j]);

            if (i == m1.length / 2)
                System.out.print("  " + op + "  ");
            else
                System.out.print("     ");

            for(int j = 0; j < m2.length; j++)
                System.out.print(" " + m2[i][j]);

            if( i == m1.length /2)
                System.out.print("  =  ");
            else
                System.out.print("     ");

            for (int j =0; j < m3.length; j++)
                System.out.print(m3[i][j] + " ");
            
            System.out.println();
        }
    }
}