import java.util.Scanner;

public class Java_04_05 {
    //Literals
    public static void main(String args[]){

        final int age=10;
        boolean pass1=true;
        System.out.print(age);
        System.out.print(pass1);

        //user input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int a=sc.nextInt();
        System.out.println("Enter num 2");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of two numbers"+sum);
    }
}
