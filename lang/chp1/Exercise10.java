class Exercise10 {
    static double kmToMiles(double km) {
        double miles = km * 1.6;
        return miles;
    }
    static double timeConverter(double min, double sec){
        double hour = (min / 60) + (sec / 3600);
        return hour;
    }
    static double milesPerHour(double km, double min, double sec) {
         double milesPerHour = kmToMiles(km)/timeConverter(min,sec);
        return milesPerHour;
    }
    public static void main(String[] args){
        System.out.println("The runner is moving at " + milesPerHour(14,45,30) + " miles per hour");
    }
}