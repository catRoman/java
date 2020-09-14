class Exercise9 {
    static double area(double width, double height) {
        double area = 0;
        area = width * height;
        return area;
    }

    static double perimeter(double width, double height){
        double perimeter = 0;
        perimeter = 2 * (width + height);
      
        return perimeter;
    }
    public static void main(String[] args){
        double height = 7.9;
        double width = 4.5;

        System.out.println("The area is: " + area(width, height));
        System.out.println("The perimeter is: " + perimeter(width, height));
    }
}