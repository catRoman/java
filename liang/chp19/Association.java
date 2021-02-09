public class Association<E1, E2> {

        private E1 one;
        private E2 two;
        public Association(E1 one, E2 two){
            this.one = one;
            this.two = two;
        }
        public E1 getOne(){
            return one;
        }
        public void setOne(E1 one){
            this.one = one;
        }
        public E2 getTwo(){
            return two;
        }
        public void setTwo(E2 two){
            this.two = two;
        }
        @Override
        public String toString(){
            return "[ " + getOne().toString() + " , "
                    + getTwo().toString() + " ]";
        }
    }