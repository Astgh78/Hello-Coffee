import java.util.Scanner;

public class CoffeMachine {
    public static void main(String[] args) {
        int water = 200;
        int milk = 50;
        int coffee = 15;
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the amount of needed coffee");
        int cup = in.nextInt();

        System.out.println("For " + cup + " cup of coffee we need " + cup * coffee + "g of coffee beans, " + cup * milk + "ml of milk, " + cup * coffee + "ml of water.");

    }
}
