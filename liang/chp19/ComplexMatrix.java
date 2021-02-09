public class ComplexMatrix 
    extends GenericMatrix<Complex> {
        @Override // add
        protected Complex add(Complex o1, Complex o2){
            return o1.add(o2);
        }
        @Override
        protected Complex multiply(Complex o1, Complex o2){
            return o1.multiply(o2);
        }
        @Override
        protected Complex zero(){
            return new Complex();
        }
    }