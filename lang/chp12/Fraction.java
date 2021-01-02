/**======================
 *      Fraction
 * ======================
 * -numerator
 * -denominator
 * -result
 * +Fraction()
 * +Fraction(int numerator, int denominator)
 * +getNumerator(): int
 * +getDenominator(): int
 * +getresult(): double
 * +setNumerator(int numerator): void
 * +setDenominator(int denominator): void
 * +toString() 
 */

 public class Fraction{
     private final int numerator;
     private final int denominator;
     private double result;

     public Fraction() 
        throws NullDenominatorException{
        this(1,1);
     }
     public Fraction(int numerator, int denominator)
        throws NullDenominatorException{
            if(denominator == 0)
                throw new NullDenominatorException();
            else{
                this.denominator = denominator;
                this.numerator = numerator;
            }
        }
        public int getNumerator(){
            return numerator;
        }
        public int getDenominator(){
            return denominator;
        }
        public double getResult(){
            return getNumerator()/getDenominator();
        }
        
        @Override
        public String toString(){
            return getNumerator() + " / " + getDenominator();
        }

 }