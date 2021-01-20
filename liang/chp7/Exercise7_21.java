/** 
(Game: bean machine) The bean machine, also known as a quincunx or the Gal-
ton box, is a device for statistics experiments named after English scientist Sir
Francis Galton. It consists of an upright board with evenly spaced nails (or pegs)
in a triangular form, as shown in Figure 7.13.

Each ball takes a random path and falls into a slot.
Balls are dropped from the opening of the board. Every time a ball hits a nail, it
has a 50% chance of falling to the left or to the right. The piles of balls are accu-
mulated in the slots at the bottom of the board.
Write a program that simulates the bean machine. Your program should prompt
the user to enter the number of the balls and the number of the slots in the machine.
Simulate the falling of each ball by printing its path. For example, the path for
the ball in Figure 7.13b is LLRRLLR and the path for the ball in Figure 7.13c isProgramming Exercises 281
RLRRLRR. Display the final buildup of the balls in the slots in a histogram. Here
is a sample run of the program:
Enter the number of balls to drop: 5
Enter the number of slots in the bean machine: 8
LRLRLRR
RRLLLRR
LLRLLRR
RRLLLLL
LRLRRLR
O
O
OOO
(Hint: Create an array named slots . Each element in slots stores the num-
ber of balls in a slot. Each ball falls into a slot via a path. The number of Rs in
a path is the position of the slot where the ball falls. For example, for the path
LRLRLRR, the ball falls into slots[4] , and for the path is RRLLLLL, the ball
falls into slots[2] .)
*/

import java.util.Scanner;

public class Exercise7_21{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("How the number of balls to drop: ");
        int balls = input.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");

        int numSlots = input.nextInt();
        
        System.out.println();
       
        beanMachine(balls, numSlots);
        

    
    }
    public static void beanMachine(int balls, int numSlots){
        int[] slots = new int[numSlots];
       
        while(balls > 0){
        int rCount = 0;
        String choice = "";
        for(int i = 1; i <= numSlots -1; i++){
           
            int random = (int)(Math.random() * 101);
            if(random > 50){
                rCount++;
                choice += "R";
            }else
                choice += "L"; 
            
        }
        
        slots[rCount]++;
        balls--;
        
        System.out.println(choice);
        }

        int maxNum = slots[0];
        for(int i = 0; i < slots.length; i++){
          if(maxNum < slots[i])
            maxNum = slots[i];
        }
        int listNum = maxNum;
        System.out.println();

        for(int i = 0; i < maxNum; i++){
            
            for(int j = 0; j < slots.length; j++){
                if(slots[j] >= listNum)
                    System.out.print("0");
                else
                    System.out.print("*");
            }
            
            listNum--;
            System.out.println();
        }
     
        
    }

    
}