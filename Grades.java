import java.util.*;
public class Grades{
    public static void main(String[]args){
        int grade;
        Scanner input=new Scanner(System.in);
        System.out.print("what is your (numerical) grade: ");
        grade=input.nextInt();
        if(grade>=97){
            System.out.println("your grade is an A+, awesome!");
        }
        if((grade<97)&&(grade>=93)){
            System.out.println("your grade is an A, wow!");
        }
        if((grade<93)&&(grade>=90)){
            System.out.println("your grade is an A-, great job!");
        }
        if((grade<90)&&(grade>=87)){
            System.out.println("your grade is a B+, good job!");
        }
        if((grade<87)&&(grade>=83)){
            System.out.println("your grade is a B, doing good");
        }
        if((grade<83)&&(grade>=80)){
            System.out.println("your grade is a B-, okay");
        }
        if((grade<80)&&(grade>=77)){
            System.out.println("your grade is a C+, almost there");
        }
        if((grade<77)&&(grade>=73)){
            System.out.println("your grade is a C, try harder");
        }
        if((grade<73)&&(grade>=70)){
            System.out.println("your grade is a C-, good luck");
        }
        if((grade<70)&&(grade>=65)){
            System.out.println("your grade is a D, oh...");
        }
        if(grade<65){
            System.out.println("your grade is a F, maybe drop the class");
        }
    }
}