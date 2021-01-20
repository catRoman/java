import java.util.Scanner;

public class Exercise10_15{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[][] points = new double[5][2];

        System.out.print("Enter five point: ");
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points[i].length; j++){
                points[i][j] = input.nextDouble();
            }
        }

        MyRectangle2D r = getRectangle(points);
        System.out.print("The bounding rectangles center (");
        System.out.print(r.getX() + " , ");
        System.out.println(r.getY() + "), width " + r.getWidth() + ", height " + r.getHeight());

    }
    public static MyRectangle2D getRectangle(double[][] points){
        //find max/min values of x and y

        double maxX = points[0][0];
        double minX = points[0][0];

        double maxY = points[1][0];
        double minY = points[1][0];

        for(int i = 0; i < points.length; i++){
            maxX = Math.max(maxX, points[i][0]);
            minX = Math.min(minX, points[i][0]);
            maxY = Math.max(maxY, points[i][1]);
            minY = Math.min(minY, points[i][1]);
        }

        double width = Math.abs(maxX - minX);
        double height = Math.abs(maxY - minY);

        double x = (maxX -(0.5 * width));
        double y = (maxY - (0.5 * height));

        return new MyRectangle2D(x, y, width, height);

    }
}