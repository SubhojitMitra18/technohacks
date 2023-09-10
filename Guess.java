import java.util.Scanner;
class Guess {
  public static void main(String[] args) {
    int range = (int) (Math.random() * (100 - 1 + 1) + 1);
    Scanner sc = new Scanner(System.in);
    int guess = 0;
    while (guess != range) {
      System.out.println("Enter Your Guess: ");
      guess = sc.nextInt();
      if (guess == range) {
        System.out.println("You are Correct!!!!");
      } else {
        if (guess < range) {
          System.out.println("You are worng... Please enter a greater number");
        } else {
          System.out.println("You are wrong... Please enter a smaller number");
        }
      }
    }
  }
}