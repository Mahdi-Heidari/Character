package charactertest;

import java.util.Random;
import java.util.Scanner;

public class CharacterTest {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a character:\t");

//      Consume strickly one character
        char ch = reader.next(".").charAt(0);
        System.out.printf("The ASCII code for [%c] is [%d].\n\n", ch, (int) ch);

//       The following codes test whether a character ch is an uppercase letter, a lowercase letter, or a digital character.
//        Custom
        System.out.println("Custom check:");

        if (ch >= 'a' && ch <= 'z') {
            System.out.printf("[%c] is a lowercase letter!", ch);
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.printf("[%c] is an uppercase letter!", ch);
        } else {
            System.out.printf("[%c] is a digital character!", ch);
        }

//        Using Character class methods
        System.out.println("\n\nCharacter class methods:");

        if (Character.isLowerCase(ch)) {
            System.out.printf("[%c] is a lowercase letter!", ch);
        } else if (Character.isUpperCase(ch)) {
            System.out.printf("[%c] is an uppercase letter!", ch);
        } else {
            System.out.printf("[%c] is a digital character!", ch);
        }

//        Methods in the Character Class
        System.out.println("\n\nMethods in the Character class:");

        System.out.printf("isDigit [%c]: %b\n", ch, Character.isDigit(ch));
        System.out.printf("isLetter [%c]: %b\n", ch, Character.isLetter(ch));
        System.out.printf("isLetter or Digit [%c]: %b\n", ch, Character.isLetterOrDigit(ch));
        System.out.printf("isLowerCase [%c]: %b\n", ch, Character.isLowerCase(ch));
        System.out.printf("isUpperCase [%c]: %b\n", ch, Character.isUpperCase(ch));
        System.out.printf("toLowerCase [%c]: %c\n", ch, Character.toLowerCase(ch));
        System.out.printf("toUppercase [%c]: %c\n", ch, Character.toUpperCase(ch));

//        Generating random letters:
        Random random = new Random();

        //        This code generates random lowercase letters.
        System.out.println("\nRandom lowercase letter:");

        System.out.println((char) ('a' + random.nextDouble() * ('z' - 'a' + 1)));
//        System.out.println((char) ('a' + Math.random() * 26));
//        System.out.println((char) ('a' + Math.random() * ('z' - 'a' + 1)));

        //        This code generates random uppercase letters.
        System.out.println("\nRandom uppercase letter:");

        System.out.println((char) ('A' + random.nextDouble() * ('Z' - 'A' + 1)));
//        System.out.println((char) ('A' + Math.random() * 26));
//        System.out.println((char) ('A' + Math.random() * ('Z' - 'A' + 1)));

        //        This code generates random digit characters.
        System.out.println("\nRandom digit character:");

        System.out.println((char) ('0' + random.nextDouble() * ('9' - '0' + 1)));
//        System.out.println((char) ('0' + Math.random() * 10));
//        System.out.println((char) ('0' + Math.random() * ('9' - '0' + 1)));
//        System.out.println((int) (Math.random() * 10));

        
        /*TIP: Whenever a couple of chars or 1 char and 1 numeric nom are evaluated by Arithmetic Operators
         It's their UNICODE that is computed not the letters themselves      
         Here are sample statements*/
        System.out.println('c' + 'a');
        System.out.println('c' + 2);

        Scanner input = new Scanner(System.in);
//      Reading a numeric character from the standard input
        System.out.print("Enter a digit...\t");
        char nom = input.next().charAt(0);
        while (nom < '0' || nom > '9') {
            System.out.println("Invalid input! Try again...");
            nom = input.next().charAt(0);
        }
//      Displaying the numeric digit in the Console.
        System.out.printf("The digit is %d.\n", nom - '0');
        
        
//        In the following code the characters '2' and '0' are implicitly casted to their code value in decimal and then the difference
//        of them is calculated.
        int difference = '2' - '0';             // 50 - 48 = 2
        System.out.println(difference);

//        The same process takes place for the following code but as it turn out the difference value gets implicitly casted to a character data 
//        type and asigned to the char variable.
        char c = '2' - '0';                         // 50 - 48 = 2 and then 2 gets casted to a char data type (char) 2.
        System.out.println(c);              // Number 2 is the code value in decimal of the character single space.
    }

}
