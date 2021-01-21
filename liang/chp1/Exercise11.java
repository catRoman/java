class Exercise11{
    
public static int birthsYear = secondsInaYear() / 7;
        public static int deathsYear = secondsInaYear() / 13;
        public static int immigrationYear = secondsInaYear() / 45;    

    static int secondsInaYear() {
        int secondsInaYear = (365 * 60) * 60;
        return secondsInaYear;
    }
    static int populationChange(){
    
        int total = (birthsYear + immigrationYear) - deathsYear;
        return total;
          
    }
    static int currentPop(int year){
        int population = 312032486;
        int currentPop = population + (year * populationChange());
        return currentPop;
    }

public static void main(String[] args){
    int year[] = {0,1,2,3,4,5};
    int pop[] = {currentPop(year[0]),currentPop(year[1]),currentPop(year[2]),currentPop(year[3]),currentPop(year[4]),currentPop(year[5])};
    System.out.println("there are roughly " + birthsYear + " births a year");
    System.out.println("there are roughly " + deathsYear + " deaths a year");   
    System.out.println("there are roughly " + immigrationYear + " new immigrants a year");
    System.out.println();
    System.out.println("The current population is: " + pop[0]);
    System.out.println("The population " + year[1] + " year from now is: " + pop[1]);
    System.out.println("The population " + year[2] + " year from now is: " + pop[2]);
    System.out.println("The population " + year[3] + " year from now is: " + pop[3]);
    System.out.println("The population " + year[4] + " year form now is: " + pop[4]);
    System.out.println("The population " + year[5] + " year from now is: " + pop[5]);
    
}
}