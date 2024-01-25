package D_Arrays.com;


import java.util.Arrays;

/*
> Arrays are a List of Numbers, strings
> are Reference types: we need "new"
> 0 - based

 */
public class Main {

    public static void main (String[] args) {
        int [] numbers = {2, 3, 4, 1, 4};

        Arrays.sort(numbers);

        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));

        //Multidimensional array   here: 2 rows 3 columns
        int [][] dimenNumbers = { { 1,2,3}, {4,5,6}}
        System.out.println(Arrays.deepToString(dimenNumbers));

        //3 dimensional Array
        int [][][] threedimensional = new int[][][];
        threedimensional




        /*      //old way
        int [] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

         */


    }
}

