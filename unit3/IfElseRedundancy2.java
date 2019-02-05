import java.util.Scanner;

public class IfElseRedundancy2 {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        int total = 0;
        int sum = 1000;
        Scanner console = new Scanner(System.in);
        System.out.print("Is your money multiplied 1 or 2 times? ");
        int times = console.nextInt();
        if (times == 1) {
            System.out.print("And how much are you contributing? ");
            int donation = console.nextInt();
            sum = sum + donation;
            count1++;
            total = total + donation;
        }
        if (times == 2) {
            System.out.print("And how much are you contributing? ");
            int donation = console.nextInt();
            sum = sum + 2 * donation;
            count2++;
            total = total + donation;
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(total);
        System.out.println(sum);
    }
}