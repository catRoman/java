public class Exercise10_14{
    public static void main(String[] args){
        MyDate mD = new MyDate(561555550000L);
        MyDate today = new MyDate();

        System.out.println(today.getYear() + "," + today.getMonth() + "," + today.getDay());
        System.out.println(mD.getYear() + "," + mD.getMonth() + "," + mD.getDay());
    }
}