import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the bot you made.");
        String botName = scanner.nextLine();
        System.out.println("Now enter the year the bot was made.");
        String yearBorn = scanner.nextLine();
        greet(botName, yearBorn);
        System.out.print("Please type your name:");
        String userName = scanner.nextLine();
        remindName(userName);
        guessAge();
        System.out.println("Input the number to count to.");
        int number = scanner.nextInt();
        countTo(number);
        quiz();

    }

    static void greet(String botName, String birthYear) {
        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + birthYear +".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName(String name) {
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5, and 7.");
        int remainder3 = scanner.nextInt() % 3;
        int remainder5 = scanner.nextInt() % 5;
        int remainder7 = scanner.nextInt() % 7;
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void countTo(int number) {
        System.out.println("Now I will prove to you that I can count to the number you want.");
        for(int i = 0; i <= number; i++) {
            System.out.println(i + "!");
        }
    }

    static void quiz() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");


        while (true) {
            int answer = scanner.nextInt();
            if(answer == 2) {
                end();
                break;
            }
            System.out.println("Please, try again.");
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}