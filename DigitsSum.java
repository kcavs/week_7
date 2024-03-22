import java.util.*;
public class DigitsSum {
    public static void main(String[]args){
        int og_num;
        int sum=0;
        Scanner input= new Scanner(System.in);
        System.out.print("enter a positive integer: ");
        og_num=input.nextInt();
        while(og_num>0){
            sum+=og_num%10;
            og_num=(og_num-(og_num%10))/10;
        }
        System.out.print("the sum of your digits is: "+sum);
    }
    
}
