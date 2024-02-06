package J_ScannerClass_ReadingUserInput.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("your are " + age);


        /*
        > here if i type just Franzi, everything is fine.
        > but if I type Franzi Otto, we have 2 tokens, but each method only takes one token
        > we need nextLine() -> this gives us everything in the line, no matter how much spaces or taps.

         */
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Name:");
        String name = scanner2.next();
        System.out.println("your are " + name);

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Name:");
        String name3 = scanner3.nextLine().trim().toLowerCase();

        if (name3.equals("franziska")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.out.println("your are " + name3);

    }
}
