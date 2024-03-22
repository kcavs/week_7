import java.text.NumberFormat;
public class Investment {
    public static void main (String[]args){
        double value= 2500.0;
        double intrest=0.075;
        int years=0;
        NumberFormat money= NumberFormat.getCurrencyInstance();
        while(value<5000.0){
            value+=(value*intrest);
            years+=1;
        }
        System.out.println("after "+years+" years the value of your investment is "+(money.format(value)));
    }
}
