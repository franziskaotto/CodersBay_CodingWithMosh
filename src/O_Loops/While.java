package O_Loops;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        //for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello word" + i);

        }


        Scanner scanner = new Scanner(System.in);
        String input = "";


        while (true){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if(input.equals("pass")) {
                continue;
            }
            if(input.equals("quit")) {
                break;
            }
            System.out.println(input);
        }



    }
}


