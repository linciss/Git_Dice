import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please input the times you want to throw the dice");
        int times = scan.nextInt();
        throwDice(times);

    }

    static void throwDice(int times){
        for(int i =0; i<times;i++)
            System.out.print(rand.nextInt(6)+1+" ");
    }

}
