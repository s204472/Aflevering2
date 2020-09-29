import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter line to check: ");
        String originalInput = scanner.nextLine();
        String input = originalInput.toLowerCase();
        input = input.replaceAll("[^a-z]", "");
        if (!input.isEmpty()){
            if (checkPalindrome(input)){
                System.out.println("\"" + originalInput + "\" is a palindrome");
            } else {
                System.out.println("\"" + originalInput + "\" is not a palindrome");
            }
        } else {
            System.out.print("No text was entered");
        }
    }

    public static Boolean checkPalindrome(String input){
        int len = input.length();
        for (int i = 0; i < (len - 1) / 2; i++){
            if (input.charAt(i) != input.charAt(len - 1 - i)){
                return false;
            } 
        }
        return true;
    }
}


