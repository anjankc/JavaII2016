
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("(And all the people of the World)");

        Scanner reader = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = reader.nextLine();  // Reads string and store in string varible name
        System.out.println("How old are you?");
        int age = Integer.parseInt(reader.nextLine()); // Reads integer and store in  variable age

        System.out.println("Your name is " + name + "." + " And you are " + age + " years old.");

        if (name.equals("Tom")) {  // comparing string works differently than integer/ numbers 
            System.out.println("Oh! You are Tom. Nice to meet you.");
        }

        System.out.println("Welcome to your Desktop"); // System login Welcome Screen
        System.out.println("Type your username:");
        String userName = reader.nextLine();
        System.out.println("Type your passwords:");
        String passwords = reader.nextLine();

        if ((userName.equals("chanel") && passwords.equals("dog")) || (userName.equals("minttu") && passwords.equals("cat"))) {
            System.out.println("Congratulation! " + userName + "! You are logged into the System."); // can only logged in if user and pswd matches
        } else {
            System.out.println("Go Away! Hacker!");
        }

        System.out.println("****************It's time to write code for a Calculator***************");

        while (true) {
            System.out.print("Please type operation name:(sum or sub or mult or div or exit):");
            String cmd = reader.nextLine();
            if (cmd.equals("sum") || cmd.equals("sub") || cmd.equals("mult") || cmd.equals("div") || cmd.equals("exit")) {

                if (cmd.equals("exit")) {
                    System.out.println("Thank you for using calculator. GOodbye!");
                    break;
                }

                System.out.println("Please enter two numbers(first no. Press enter and second number):");
                double num1 = Double.parseDouble(reader.nextLine());
                double num2 = Double.parseDouble(reader.nextLine());

                if (cmd.equals("sum")) {
                    System.out.println("The sume is " + (num1 + num2));
                } else if (cmd.equals("sub")) {
                    System.out.println("The difference is " + (num1 - num2));
                } else if (cmd.equals("mult")) {
                    System.out.println("The multiplication is " + (num1 * num2));
                } else if (cmd.equals("div")) {
                    System.out.println("The divisor is " + ((double) num1 / num2));
                }

            } else {
                System.out.println("Type Correct command:");
            }

        }

    }

}
