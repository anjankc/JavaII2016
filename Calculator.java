import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

Scanner reader = new Scanner(System.in);
 while (true) {
            System.out.print("Please type operation name:(sum or sub or mult or div or exit):");
            String cmd = reader.nextLine();
            if (cmd.equals("sum") || cmd.equals("sub") || cmd.equals("mult")|| cmd.equals("div")|| cmd.equals("exit")  ) {
             
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

            }
            else
            {System.out.println("Type Correct command:");
            } 
           
        }
        
        }}
