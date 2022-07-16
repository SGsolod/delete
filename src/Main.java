import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner multiplication = new Scanner(System.in);
        System.out.println("Введи любое число от 1 до 9 число");
        int number = multiplication.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(number + "x" + (i + 1) + "=" + (number * (i+1)));
        }
        System.out.println("Теперь запони эту таблицу !!!!");
    }
}

