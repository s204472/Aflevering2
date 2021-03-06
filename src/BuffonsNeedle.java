import java.util.Random;
import java.util.Scanner;

public class BuffonsNeedle {
	public static final int LINE_DIST = 2;
	public static final int NEEDLE_LENGTH = LINE_DIST / 2;

	/*
	 * The program runs a for-loop of x iterations, in each iteration the program simulates a new needle being thrown and it's position.
	 * The program keeps track of hits and misses and calculates the ratio of throws/hits.
	 */
	public static void main(String[] args) {

		double drops = getInput();
		double hits = 0;
		double needleStart;
		double needleEnd;
		double angle;

		Random rand = new Random();

		for (int i = 0; i < drops; i++) {
			needleStart = rand.nextInt(LINE_DIST * 100);
			needleStart /= 100;
			angle = rand.nextInt(361);
			needleEnd = Math.cos(Math.toRadians(angle)) * NEEDLE_LENGTH + needleStart;
			if (needleEnd <= 0 || needleEnd >= LINE_DIST) {
				hits++;
			}
		}
		if (hits > 0) {
			double ratio = drops / hits;
			System.out.print(drops + " / " + hits + " = " + ratio);
		} else {
			System.out.println("No hits, was registered. Ratio can't be calculated.");
		}
		

	}

	/*
	 * This method asks the user for an input.
	 * It handles wrong inputs, using while-loops, the hasNextInt scanner function and if statements.
	 */
    public static int getInput() {
    	Scanner input = new Scanner(System.in);
		int num = 0; 
		System.out.print("Enter number of iterations: ");
		while(true){
			while (!input.hasNextInt()){
				input.next();
				System.out.println("Wrong input, try again");
			}
			num = input.nextInt();
			if (num > 0) {
				return num;
			} else {
				System.out.println("Wrong input, try again");
			}
		}
    }


}
