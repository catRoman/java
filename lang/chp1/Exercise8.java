class Exercise8 {
    static double perimeter(double radius) {
        double perimeter = 0;
        perimeter = 2 * radius * Math.PI;
        return perimeter;
    }
    static double area(double radius) {
        double area = 0;
        area = radius * radius * Math.PI;
        return area;
    }
    public static void main(String[] args) {
        double radius = 5.5;
    
    System.out.println("The perimeter is: " + perimeter(radius));
    System.out.println("The area is: " + area(radius));
    }
}