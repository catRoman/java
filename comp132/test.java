public Test{
    public static void main(String[] args){

        int[][] test = new int[6][6];

        Lab6.fillSeatsRandomly(test);

        System.out.println(java.util.Arrays.toDeepString(test));
    }
}