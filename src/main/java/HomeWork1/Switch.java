package HomeWork1;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        SwitchMethod();
    }

    private static void SwitchMethod() {
        System.out.println("Input any number: ");
        Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
              switch (number) {
                  case 1:
                      System.out.println("Number = " + number);
                      break;
                  case 2:
                      System.out.println("Number = " + number);
                      break;
                  default:
                      System.out.println("Number is incorrect");

            }

    }
}
