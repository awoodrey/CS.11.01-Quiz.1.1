import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your age:");
    int age = scanner.nextInt();
    System.out.println("Please enter your name:");
    String firstName = scanner.nextString();
    System.out.println("Please enter your favourite food:");
    String favouriteFood = scanner.nextString();
    System.out.println("First name: " + firstName + "\nAge: " + age + "\nFavourite Food: " + favouriteFood);
    }
}