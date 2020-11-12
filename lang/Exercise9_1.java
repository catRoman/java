public class Exercise9_1{
    public static void main(String[] args){
    

        Rectangle[] rectangleList = {new Rectangle(4,40), new Rectangle(3.5, 35.9)};

        for(int i =0; i < rectangleList.length; i++){
            System.out.println("Rectangle " + (i + 1) + " width: " + rectangleList[i].width);
            System.out.println("Rectangle " + (i + 1) + " height: " + rectangleList[i].height);
            System.out.println("Rectangle " + (i + 1) + " area: " + rectangleList[i].getArea());
            System.out.println("Rectangle " + (i + 1) + " perimeter: " + rectangleList[i].getPerimeter());
            System.out.println();
        }

        
    }
}