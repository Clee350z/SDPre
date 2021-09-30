import java.util.Scanner;

public class Objective5Lab4{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number to see if it is odd or even");
    int userNum = scanner.nextInt();

    if(userNum % 2 == 0){
      System.out.println("Your number is even.");
    }
    if(userNum % 2 == 1){
      System.out.println("Your number is odd.");
    }
    scanner.close();

  }
}
