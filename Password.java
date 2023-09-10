import java.util.*;
public class Password{
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter length(minimum 6) & complexity(1-5)");
        int n=sc.nextInt();
        int complex=sc.nextInt();
        if(n>=6 && complex>=1 && complex<=5)
      System.out.println(generatePassword(n,complex));
      else 
      System.out.println("Invalid Length and Complexity");
   }

   private static char[] generatePassword(int length,int complex) {
      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
      String specialCharacters = "!@#$";
      String numbers = "1234567890";
      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
      Random random = new Random();
      char[] password = new char[length];
      if(complex==5){
          password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
      password[3] = numbers.charAt(random.nextInt(numbers.length()));
   
      for(int i = 4; i< length ; i++) {
         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
      }
      }
      else if(complex==1){
            System.out.println("Complexity 1");
            for(int i = 0; i< length ; i++) {
         password[i] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
      }
    }
    else if(complex==2){
            System.out.println("Complexity 2");
            String combinedloup=capitalCaseLetters+lowerCaseLetters;
            for(int i = 0; i< length ; i++) {
         password[i] = combinedloup.charAt(random.nextInt(combinedloup.length()));
      }
        }
        else if(complex==3){
            System.out.println("Complexity 3");
            String combinedloupnum=capitalCaseLetters+lowerCaseLetters+numbers;
            for(int i = 0; i< length ; i++) {
         password[i] = combinedloupnum.charAt(random.nextInt(combinedloupnum.length()));
      }
        }
        else if(complex==4){
            System.out.println("Complexity 4");
            String combinedloupsp=capitalCaseLetters+lowerCaseLetters+specialCharacters;
            for(int i = 0; i< length ; i++) {
         password[i] = combinedloupsp.charAt(random.nextInt(combinedloupsp.length()));
      }
        }
      return password;
   }
}