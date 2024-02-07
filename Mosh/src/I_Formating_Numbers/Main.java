package I_Formating_Numbers;


import java.text.NumberFormat;


public class Main {
    public static void main(String[] args) {
        //Currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        //percentage
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        System.out.println(result2);

        //method chaining
        String result3 =  NumberFormat.getPercentInstance().format(0.3);
        System.out.println(result3);
    }
}
