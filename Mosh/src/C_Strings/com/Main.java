package C_Strings.com;

/*

> Original String never gets mutated!!
> Java Strings are immutable

 */

public class Main {
    public static void main(String[] args) {
        //String message = new String("Hello World");
        String message = "Hello World";
        System.out.println(message);


        //Concatenating:
        String concat = "Hello World" + "!!";
        //concat.endsWith("!!");
        System.out.println(concat.endsWith("!!"));
        System.out.println(concat.startsWith("!!"));


        //length
        System.out.println(concat.length());


        //index of => [0]
        System.out.println(concat.indexOf("H"));
        System.out.println(concat.indexOf("AQ"));

        //Replace
            //Arguments: "H" and "A"
            //Parameters: target and replacement
        System.out.println(concat.replace("H", "A"));

        //toLoweCase, toUpperCase
        System.out.println(concat.toLowerCase());
        System.out.println(concat.toUpperCase());

        //trim
            //get rid of whitespaces at the beginning or end of a string
        System.out.println(concat.trim());

        //Special Characters//////////////////////////////////////
        String special = "Hello \"Mosh\"";
        System.out.println(special);


        String special2 = "c:\\windows\\user\\...";
        System.out.println(special2);

    }
}
