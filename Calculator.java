import java.util.Scanner;
class Calculator {
  public static void main(String[] args) {
    double n1, n2;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the operands:");
    n1 = sc.nextDouble();
    n2 = sc.nextDouble();

    char choice;
    double ans = 0;
    do {
      System.out.println("Enter the operator(+,-,*,/) & 0 for exit:");
      choice = sc.next().charAt(0);
      switch (choice) {
        case '+':
          ans = n1 + n2;
          System.out.println("The Output is: ");
          System.out.println(n1 + " " + choice + " " + n2 + "=" + ans);
          break;
        case '-':
          ans = n1 - n2;
          System.out.println("The Output is: ");
          System.out.println(n1 + " " + choice + " " + n2 + "=" + ans);
          break;
        case '*':
          ans = n1 * n2;
          System.out.println("The Output is: ");
          System.out.println(n1 + " " + choice + " " + n2 + "=" + ans);
          break;
        case '/':
          ans = n1 / n2;
          System.out.println("The Output is: ");
          System.out.println(n1 + " " + choice + " " + n2 + "=" + ans);
          break;
        case '0':
          System.out.println("Exited...");
          System.out.println();
          break;
        default:
          System.out.println(choice + " is "
              + "Wrong Input");
      }
    } while (choice != '0');
  }
}