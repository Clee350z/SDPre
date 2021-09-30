import java.util.Scanner;

public class Objective5Lab3{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a number: ");
    int userNum = scanner.nextInt();

    if(userNum > 0){
      System.out.println(userNum + " is a positive number");
      }
    if(userNum < 0){
      System.out.println(userNum + " is a negative number");
    }
    if(userNum.equals 0){
      System.out.println("You entered the number 0");
    }
  }
}
