/** ==================
 *      UML Diagram
 *  ==================
 *      LinearEquation
 *  ------------------
 *  - a : double
 *  - b : double
 *  - c : double
 *  - d : double
 *  - e : double
 *  - f : double
 *  ------------------
 *  + LinearEquation(a : double
 *                   b : double
 *                   c : double
 *                   d : double
 *                   e : double 
 *                   f : double)
 *  + getA() : double
 *  + getB() : double
 *  + getC() : double
 *  + getD() : double
 *  + getE() : double
 *  + getF() : double
 *  + isSolvable() : boolean
 *  + getX() : double
 *  + getY() : double
 */

 public class LinearEquation{
     private double a;
     private double b;
     private double c;
     private double d;
     private double e;
     private double f;

    public LinearEquation(double a, double b, double c,
                            double d, double e, double f){
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
    this.e = e;
    this.f = f;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getD(){
        return d;
    }
    public double getE(){
        return e;
    }
    public double getF(){
        return f;
    }
    public boolean isSolvable(){
        double discriminant = (a * d) - (b * c);                
        if(discriminant == 0)
            return false;
        else
            return true;
    }
    public double getX(){
        return ((e * d) - (b* f)) / ((a * d) - (b * c));
        
    }
    public double getY(){
        return ((a * f) - (e * c)) / ((a * d) - (b * c));
    }
 }