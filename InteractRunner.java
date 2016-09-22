package myPack;

import java.util.Scanner;

/**
 * Created by home on 22.09.2016.
 */
public class InteractRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try{
            Calculate calculate = new Calculate();
            String exit = "no";

            while (!exit.equals("yes")) {
                System.out.println("Enter first arg: ");
                int a = sc.nextInt();
                System.out.println("Enter second arg: ");
                int b = sc.nextInt();
                calculate.add(a, b);
                System.out.println("Result: " + calculate.getResult());
                calculate.cleanResult();

                System.out.println("Exit : yes/no ");
                exit = sc.next();
            }
        }finally {
            sc.close();
        }

    }
}
