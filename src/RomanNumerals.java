import java.util.Scanner;

public class RomanNumerals{

	/*
	 * This program translates the user input into a roman numeral, by looping over an array of roman numerals and it's corresponding value.
	 * The inputted number is reduced by the bigget roman numeral possible, and the remainder of the number is then processed in the same way.
	 */
    public static void main(String[] args){
        int[] values = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] romanNumerals = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int num = getInput();
        String output = "";
        int quantity;
        int remaining;
        
        for(int i = romanNumerals.length; i > 0; i--) {
        	if (num / values[i]>0) {
        		quantity = num / values[i];
        		remaining = num % values[i];
        		num = remaining;
        		for(int j = 0; j < quantity; j++) {
        			output += romanNumerals[i];
        		}
        	}
        }
        System.out.println(output);
	}
	
	/*
	 * This method asks the user for an input.
	 * It handles wrong inputs, using a try-catch block, and if statements 
	 */
    public static int getInput() {
    	Scanner input = new Scanner(System.in);
    	int num = 0;
        try {
			System.out.print("Enter a number between 1 and 3000: ");
        	num = input.nextInt();
        	if (num > 0 && num <= 3000) {
            	return num;
        	} else {
				System.out.println("Wrong input, try again");
            	return getInput();
        	}
        }
        catch(Exception e) {
			System.out.println("Wrong input, try again");
        	return getInput();
		}
    }
}