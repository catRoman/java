/*  (Simulation: heads or tails) Write a program that simulates
    flipping a coin one million times and displays the number
    of heads and tails 
*/

public class Exercise5_40{
    public static void main(String[] args){
        int headCount = 0;
        int tailCount = 0;
        double flip = 0;
        int total = 0;
        for(int i = 0; i < 1000000; i++){
            flip = Math.random();

            if(flip > 0.5)
                headCount++;
            else
                tailCount++;
        total++;
            }

        System.out.printf("Flips: %d, Heads: %d, Tails: %d\n", total, headCount, tailCount);
    }
}

