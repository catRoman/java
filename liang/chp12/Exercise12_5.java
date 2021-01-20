import java.util.ArrayList;

public class Exercise12_5{
    public static void main(String[] args){
        ArrayList<Triangle> myList = new ArrayList<>();
        
        try{
        myList.add(new Triangle(7,10,5, "Sea-Green", false));
        }catch(IllegalTriangleException ex){
            System.out.println(ex);
        }
        
        for(int i = 0; i < 10; i++){
        try{
            myList.add(new Triangle((int)(Math.random() * 10) + 1,
                (int)(Math.random() * 10) + 1,
                (int)(Math.random() * 10) + 1));
            myList.get(myList.size()-1).setColor(colorPick(i));
            System.out.println("\u21D2 " + myList.get(myList.size()-1).toString());
        } catch(IllegalTriangleException ex){
            System.out.println(ex);
            System.out.println();
        }    
    }
       /** for(Triangle e : myList){
            System.out.println(e.toString());
            System.out.println();
        }*/
        try{
            Triangle badTri = new Triangle(1,1,3);
            badTri.setColor("shit-Color");
            myList.add(badTri);
            System.out.println(myList.get(myList.size() - 1).toString());
        }
        catch(IllegalTriangleException ex){
            System.out.println(ex);
        }
        System.out.println();
        System.out.println("Total Objects created: " + myList.size());
    }
    public static String colorPick(int i){
        String[] color = {"White", "Blue", "Purple", "Green", "Teal",
                "Orange", "Grey", "Yellow", "Black", "Magenta"};

                return color[i];

    }
}