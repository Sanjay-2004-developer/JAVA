import java.util.Scanner;
public class Java_15 {
    public static void main(String[] args) {
       //Convert a string to  lowercase
       String name="SANJAY";
       System.out.println(name.toLowerCase());
       //Replace a space with underscores
       String sentence="My name is sanjay";
       System.out.println(sentence.replace(" ","_"));

       //To fill in a letter template
       String letter="Dear <|name|>,Thanks a lot!";
       letter=letter.replace("<|name|>","Sanjay");
       System.out.println(letter);

       //find the first index of double space and triple space
       String myString ="This string contains douuble   and triple   spaces";
       System.out.println(myString.indexOf("  "));
       System.out.println(myString.indexOf("   "));

       //problem 5 
       String my_letter="Does Sanjay \n,this Java course is Nice.\tThanks!";
       System.out.println(my_letter);


    }
}
