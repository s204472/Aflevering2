import java.util.Random;
import java.util.Scanner;

public class BuffonsNeedle {

	public static final int LINE_DIST = 2;
	public static final int NEEDLE_LENGTH = 1;

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
		double ratio = drops / hits;
		System.out.print(drops + " / " + hits + " = " + ratio);

	}

	public static int getInput() {
		Scanner input = new Scanner(System.in);
		int num = 0;
		try {
			System.out.print("Enter number of iterations: ");
			num = input.nextInt();
			if (num > 0) {
				return num;
			} else {
				System.out.println("Wrong input, try again");
				return getInput();
			}
		} catch (Exception e) {
			System.out.println("Wrong input, try again");
			return getInput();
		}
	}

}
