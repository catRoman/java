public class Exercise9_9{
    public static void main(String[] args){
        
        RegularPolygon[] poly = new RegularPolygon[3];

        for(int i = 0; i < poly.length; i++){
            switch(i){
                case 0: poly[i] = new RegularPolygon(); break;
                case 1: poly[i] = new RegularPolygon(6,4); break;
                case 2: poly[i] = new RegularPolygon(10,4,5.6,7.8); break;
            }
        
            System.out.println("Poly " + (i + 1) + ":");
            System.out.println("Perimeter: " + poly[i].getPerimeter());
            System.out.println("Area: " + poly[i].getArea());
            System.out.println();
        }
        


        
    }
}