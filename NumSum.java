import java.util.*;
public class NumSum {
    public static void main(String[]args){
        int num;
        int sum= 0;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a possitive whole number: ");
        num=input.nextInt();
        while(num>0){
            System.out.println(num);
            sum+=num;
            num-=1;
        }
        System.out.println("the sum is: "+sum);
    }
}
