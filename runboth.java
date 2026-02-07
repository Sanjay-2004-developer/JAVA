import java.util.Scanner;
public class runboth{
    public static void main(String[] args) {
        
        Java_11__12.main(args);
        prac.main(args);
        encrypt_decrypt.main(args);
    }
}



class Java_11__12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a new number");
        int a=sc.nextInt();
        System.out.println(a+100);
        
        
    }
}
//Practice questions
 class prac {
public static void main(String[] args) {
    float a=7/4*9/2;
    System.out.println(a);
}
}

class encrypt_decrypt{

    public static void main(String[] args) {
        char ch='B';
        ch+=8;
        System.out.println("After Encryption:");
        System.out.println(ch);
        ch-=8;
        System.out.println("After Decryption:");
        System.out.println(ch);
    }
}