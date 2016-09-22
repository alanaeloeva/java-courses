package myPack;

import java.util.Scanner;

/**
 * Created by home on 22.09.2016.
 */
public class InteractRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculate calculate = new Calculate();
        int a, b;
        String c = " ";



       do { System.out.println("Что будем делать? ");
            c = sc.next();

            switch (c) {

                case "+":
                    System.out.println("Введите первое число:");
                    a= sc.nextInt();
                    System.out.println("Введите второе число");
                    b = sc.nextInt();
                    calculate.add(a, b);
                    System.out.println("Результат: " + calculate.getResult());
                    break;

                case "-":
                    System.out.println("Введите первое число:");
                    a= sc.nextInt();
                    System.out.println("Введите второе число");
                    b = sc.nextInt();
                    calculate.div(a, b);
                    System.out.println("Результат: " + calculate.getResult());
                    break;

                case "*":
                    System.out.println("Введите первое число:");
                    a= sc.nextInt();
                    System.out.println("Введите второе число");
                    b = sc.nextInt();
                    calculate.mult(a, b);
                    System.out.println("Результат: " + calculate.getResult());
                    break;

                case "/":
                    System.out.println("Введите первое число:");
                    a= sc.nextInt();
                    System.out.println("Введите второе число");
                    b = sc.nextInt();
                    calculate.sub(a, b);
                    System.out.println("Результат: " + calculate.getResult());
                    break;
            }

        }  while (!c.equals("exit"));
    }
}