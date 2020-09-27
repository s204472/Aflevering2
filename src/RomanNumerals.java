import java.util.Scanner;

public class RomanNumerals{
    public static void main(String[] args){
        int[] values = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] romanNumerals = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        //Scanner input = new Scanner(System.in);
        int num = getInput();
        String output = "";
        int quantity;
        int remaining;
        
        for(int i = 12; i>=0; i--) {
        	if (num/values[i]>0) {
        		quantity = num/values[i];
        		remaining = num%values[i];
        		num = remaining;
        		for(int j = 0; j < quantity; j++) {
        			output += romanNumerals[i];
        		}
        	}
        }
        System.out.println(output);
    }
    public static int getInput() {
    	Scanner input = new Scanner(System.in);
    	int num = 0;
        try {
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