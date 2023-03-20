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
        int biggestNum=0, num= 0;
        for(int i =0; i<times;i++){
            num = rand.nextInt(6)+1;
            System.out.print(num + " ");
        if(biggestNum < num){
            biggestNum = num;
        }
        }

        System.out.println("The biggest number is: " + biggestNum);
    }

}
