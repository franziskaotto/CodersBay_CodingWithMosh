package L_SwitchStatements;

public class Main {
    public static void main (String[] args) {

        //switch case:
        // > can be used instead of if statements, some prefer this, some if/else

        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You´re an admin");
                break;

            case "moderator":
                System.out.println("You´re an Moderator");
                break;

            default:
                System.out.println("you´re a player");
                //last case statement does not need a break, we are automatically going out of the if switch case

        }

        int number = 1;
        switch (number) {
            case 1:
                System.out.println("You´re an admin");
                break;

            case 2:
                System.out.println("You´re an Moderator");
                break;

            default:
                System.out.println("you´re a player");
                //last case statement does not need a break, we are automatically going out of the if switch case

        }
    }
}
