public class Complex 
    implements Cloneable, Comparable<Complex>{
        private Double a; //real part
        private Double b; //imaginary part

        public Complex(){
            this(0.0,0.0);
        }
        public Complex(Double a){
            this(a, 0.0);
        }
        public Complex(Double a, Double b){
            this.a = a;
            this.b = b;
        }
        public Double getImaginaryPart(){
            return this.b;
        }
        public Complex add(Complex o){
            return new Complex((this.a + o.a), (this.b + o.b));
        }
        public Complex subtract(Complex o){
            return new Complex((this.a - o.a), (this.b - o.b));
        }
        public Complex multiply(Complex o){
            return new Complex(((this.a * o.a)-(this.b * o.b)), ((this.b * o.a) + (this.a * o.b)));
        }
        public Complex divide(Complex o){
            return new Complex(
                (((this.a * o.a) + (this.b * o.b)) / (Math.pow(o.a, 2) + Math.pow(o.b,2))),
                (((this.b * o.a) - (this.a * o.b))/ (Math.pow(o.a, 2) + Math.pow(o.b,2))));
        }
        public Double abs(){
            return Math.sqrt(Math.pow(this.a,2) + Math.pow(this.b,2));
        }
        @Override
        public String toString(){
            return this.a + " + " + this.b + "i";
        }
        @Override
        public Object clone(){
            try {
                return (Complex)super.clone();
            } catch(CloneNotSupportedException ex){
                return null;
            }
        }
        @Override
        public int compareTo(Complex o){
            if(this.abs() > o.abs())
                return 1;
            else if( this.abs() == o.abs())
                return 0;
            else
                return -1;

        }


    }