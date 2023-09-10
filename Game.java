import java.util.Scanner;
class Game {
  static int gamewin(char comp, char you) {
    if (comp == 'R') {
      if (you == 'P')
        return 1;
      else if (you == 'S')
        return 0;
    } else if (comp == 'S') {
      if (you == 'P')
        return 0;
      else if (you == 'R')
        return 1;
    } else if (comp == 'P') {
      if (you == 'R')
        return 0;
      else if (you == 'S')
        return 1;
    }

    return -1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char you, comp = ' ';
    System.out.println("Your turn for Rock(R),Paper(P) or Scissor(S): ");
    you = sc.next().charAt(0);
    int rand = (int) (Math.random() * (3 - 1 + 1) + 1);
    if (rand == 1) {
      comp = 'R';
    } else if (rand == 2) {
      comp = 'P';
    } else if (rand == 3) {
      comp = 'S';
    }
    System.out.println("Computer chose :" + comp);
    int n = gamewin(comp, you);
    if (n == 1) {
      System.out.println("You Win!!!!");
    } else if (n == 0) {
      System.out.println("You Lose!!!!");
    } else if (n == -1) {
      System.out.println("Game Tied");
    }
  }
}