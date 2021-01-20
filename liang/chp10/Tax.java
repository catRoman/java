/**======================
 *       UML Diagram
 * ======================
 *          Tax
 * ----------------------
 *  - int fillingStatus
 *  - int[][] brackets
 *  - double[] rates
 *  - double taxableIncome
 * ----------------------
 *  + Tax()
 *  + Tax(fillinStatus : int, brackets : int[], rates : double[], taxableIncome : double)
 *  + getFillinfStatus() : int
 *  + setFillingStatus(fillingStatus : int)
 *  + getBrackets() : int[][]
 *  + setBrackets(brackets[][])
 *  + getRates() : double[]
 *  + setRates(rates : double[])
 *  + getTaxableIncome(): double
 *  + setTaxableIncome(taxableIncome : double)
 *  + getTax() : double
 */

 public class Tax{
     public static final int SINGLE_FILER = 0;
     public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
     public static final int MARRIED_SEPARATELY = 2;
     public static final int HEAD_OF_HOUSEHOLD = 3;

     private int filingStatus;
     private int[][] brackets;
     private double[] rates;
     private double taxableIncome;

     public Tax(){
         // default single filling
        this(SINGLE_FILER, 
            new int[][] {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 208850, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}},
            new double[] {0.10, 0.15, 0.25, 0.28, 0.33, 0.35},
            50000
            );
     }
     public Tax(int filingStatus, int[][] brackets,double[] rates,double taxableIncome){
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
     }
     public int getFilingStatus(){
         return filingStatus;
     }
     public void setFilingStatus(int filingStatus){
         this.filingStatus = filingStatus;
     }
    public int[][] getBrackets(){
         return brackets;
     }
     public void setBrackets(int[][] brackets){
         this.brackets = brackets;
     }
     public double[] getRates(){
         return rates;
     }
     public void setRates(double[] rates){
         this.rates =rates;
     }
     public double getTaxableIncome(){
         return taxableIncome;
     }
     public void setTaxableIncome(double taxableIncome){
         this.taxableIncome = taxableIncome;
     }
     public double getTax(){
         // finish chp 8 questions then finish this one

     
 }