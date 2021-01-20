class Exercise12 {
    static double milesTokm(double miles) {
        double km = miles / 1.6;
        return km;
    }
    static double timeConverter(double hour,double min, double sec){
        double total = hour + (min / 60) + (sec / 3600);
        return total;
    }
    static double kmPerHour(double miles,double hour, double min, double sec) {
         double kmPerHour = milesTokm(miles)/timeConverter(hour,min,sec);
        return kmPerHour;
    }
    public static void main(String[] args){
        System.out.println("The runner is moving at " + kmPerHour(24,1,45,30) + " kilometers per hour");
    }
}