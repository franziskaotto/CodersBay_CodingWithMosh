package F_ArithmeticExpression.com;

public class Main {
    public static void main(String[] args) {
        int addition = 10 + 3;
        int subtraction = 10 - 3;
        int multiplication = 10 * 3;
        double division = (double) 10 / (double)3;
        int modulo = 10 % 3;

        int test = 4 - 6;

        System.out.println(division);
        System.out.println(test); //works

        //increment and decrement operators => like in for loop ++
        int x = 1;
        //int y = x++; // y = 1
        int y = ++x; // y = 2
        System.out.println(x);
        System.out.println(y);

        //Augmented Operator: +=,  -=, *=, /=
        int z = x + 2;
        z += 2; // is the same code, but shorter
    }
}


/*
int division = 10 / 3;
division is interesting, since it only gives back whole numbers

> numbers are called operands
 */