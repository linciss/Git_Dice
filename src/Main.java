import java.util.Random; import java.util.Scanner;
public class Main {
	public static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int choice, times;

		do {
			System.out.println("1-Throw dice | 2-Stop");
			choice = scan.nextInt();

			switch (choice) {
				case 1:
					do {
						System.out.println("Please input the times you want to throw the dice");
						times = scan.nextInt();
					} while (times < 1);

					int[] result=throwDice(times);
					int highest=0, lowest=7, sum=0;

					for (int i = 0; i < result.length; i++) {
						if (result[i] > highest) {
							highest = result[i];
						}
						if (result[i] < lowest) {
							lowest = result[i];
						}
						sum += result[i];
						System.out.print(result[i]+" ");
					}
					System.out.println();
					System.out.println("Highest: " + highest);
					System.out.println("Lowest: " + lowest);
					System.out.println("Sum: " + sum);
					break;
				case 2:
					System.out.println("Program stopped");
					break;
			}
		} while (choice != 2);

		scan.close();
	}


	static int[] throwDice(int times) {
		int[] dice = new int[times];

		for (int i = 0; i < times; i++) {
			dice[i] = rand.nextInt(6) + 1;
		}
		return dice;
	}
}
