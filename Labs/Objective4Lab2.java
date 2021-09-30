import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter the first WHOLE number you would like to add");
    int num1 = keyboard.nextInt();
    System.out.println("Please enter the second whole number you would like to add");
    int num2 = keyboard.nextInt();
    System.out.println("Please enter the third whole number you would like to add");
    int num3 = keyboard.nextInt();
    int wholesum = num1 + num2 + num3;
    System.out.println("Please enter the first DECIMAL number you would like to add");
    double doub1 = keyboard.nextDouble();
    System.out.println("Please enter the second decimal number you would like to add");
    double doub2 = keyboard.nextDouble();
    System.out.println("Please enter the third decimal number you would like to add");
    double doub3 = keyboard.nextDouble();
    double doublesum = doub1 + doub2 + doub3;

    System.out.println("The total of " + num1 + " and " + num2 + " and " + num3 + " equals " + wholesum +".");
    System.out.println("The total of " + doub1 + " and " + doub2 + " and " + doub3 + " equals " + doublesum +".");

  }
}
