package OwnExcep;

import java.util.Scanner;

public class OwnMain {
    public static void main(String[] args) {
        while (true) {
            System.out.println("START OF PROGRAM");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите число от 0 до 10");
            int a = scanner.nextInt();
            try {
                checkNumber(a);
                System.out.println();
                System.out.println("END OF PROGRAM!!!");
                //break;
                return;
            } catch (WrongNumberExcep e) {
                e.printStackTrace();
                a = a - 1;
                System.out.println(a);
            }
            System.out.println("END OF PROGRAM 2");
        }
    }

    public static void checkNumber(int a) throws WrongNumberExcep {
        if (a < 0 || a > 10 ) {
            throw new WrongNumberExcep("Введенное число не в диапазоне!");
        }
        System.out.printf("Введенное число: %s", a);
    }
}
