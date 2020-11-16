public class Exercise9_8{
    public static void main(String[] args){
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(fan1.HIGH);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);

        fan2.setSpeed(fan2.MEDIUM);

        System.out.println("Fan 1:\n" + fan1.toString());
        System.out.println();
        System.out.println("Fan 2:\n" + fan2.toString());
    }
}