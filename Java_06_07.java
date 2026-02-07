import java.util.Scanner;
public class Java_06_07 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the student marks out of 100");
    int sub1=sc.nextInt();
    int sub2=sc.nextInt();
    int sub3=sc.nextInt();
    int sub4=sc.nextInt();
    int sub5=sc.nextInt();
    int percentage=(sub1+sub2+sub3+sub4+sub5)/5;
        System.out.println(percentage);
    }
}
