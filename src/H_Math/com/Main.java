package H_Math.com;

public class Main {
    public static void main(String[] args) {
        int result1 = Math.round(float a);
        int result2 = Math.round(double a);

        int aufrunden = Math.ceil(1.1F);        // 2
        int abrunden = Math.ceil(1.1F);         // 1

        int returnGreaterNumber = Math.max(1,2); // 2
        int returnSmallerNumber = Math.min(1,2); // 1

        double random = Math.random();              //zw. 0-1
        double random2 = Math.random() * 100;       //zw. 0-100

        double result = Math.round(Math.random() * 100);        //99.0
        int result2 = (int) (Math.round(Math.random() * 100));     //99



    }
}
