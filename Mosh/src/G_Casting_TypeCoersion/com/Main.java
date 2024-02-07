package G_Casting_TypeCoersion.com;

public class Main {
    public static void main(String[] args) {
        /*adding a short to an integer -> works. one will be converted under the hood, so they are equal => see how many bytes one has:
        short = 2 bytes
        int = 4 bytes
        > so all the shorts can be stored in an int.

       ! > implicit casting: Java looks at 2. x (int y = x + 2). makes an anonymous copy in the memory of x, but this time as an integer.
            then takes the value of the now int x and copies it, then adds the 2 to it, and tada = 3.
            > aka automatic conversion

            > works with data types that are bigger: byte > short > int > long
         */
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        /*floating numbers: automatically adds a .0 to a whole number
        > > works with data types that are bigger: byte > short > int > long > float > double

GENEREL ROULE: implicit casting happens when we are not gonna loose data

         */
        double a = 1.1;
        double b = a + 2; // 1.1 + 2.0
        System.out.println(b);

        /*
        //DOES NOT WORK
        double c = 1.1;
        int e = c + 2;
        System.out.println(e);
         */



        //with wrapper classes => int and char

        String f = "1";
        int g = Integer.parseInt(f) + 2;
        System.out.println(g);
    }

}
