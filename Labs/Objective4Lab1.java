import java.util.Scanner;
public class Objective4Lab1 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is your first name? : ");
    String firstname = keyboard.nextLine();
    System.out.println("What is your last name? : ");
    String lastname = keyboard.nextLine();
    System.out.println("What is your favorite animal? : ");
    String favoriteAnimal = keyboard.nextLine();
    System.out.println("What is your favorite food? : ");
    String favoriteFood = keyboard.nextLine();
    System.out.println("What is your favorite song? : ");
    String favoriteSong = keyboard.nextLine();

    System.out.println("All about you : " + "Name: " + firstname + " " + lastname);
    System.out.println("Your Favorite animal is: " + favoriteAnimal);
    System.out.println("Your Favorite song is: " + favoriteSong);
    System.out.println("Your Favorite food is: " + favoriteFood);
  }
}
