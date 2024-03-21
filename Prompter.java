import java.util.*;
public class Prompter {
    public static void main(String[]args){
        int min;
        int max;
        int num=0;
        Scanner input=new Scanner(System.in);
        System.out.print("enter a min value: ");
        min=input.nextInt();
        System.out.print("enter a max value: ");
        max=input.nextInt();
        while((max<num)||(num<min)){
        System.out.print("enter a number within the min-max range: ");
        num=input.nextInt();
        }
    }
}
