package K_CalculatorProject;


/*
Principal: 100_000;
Annual Interest Rate: 3.92;
Period (Years): 30
Mortgage: €472.81

*/
public class Main {
    public static void main(String[] args){
        int temp = 15;
        if (temp > 30) {                            //this is a clause
            System.out.println("Its a hot day");
            System.out.println("drink water");
        }
        else if (temp > 20)                         //this is a clause
            System.out.println("beautiful day");

        else                                        //this is a clause
            System.out.println("Cold day");

        //PS das ohne klammern schaut unfertig aus


        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);


        //terniary operator:

        String className = income > 100_000 ? "First" : "Economy";

        /*
        if(income > 100_000)
            className = "First";
        else
            className = "Economy";

         */





    }
}








