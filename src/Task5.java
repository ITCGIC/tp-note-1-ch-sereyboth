import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        double RielRatePerDollar = 4000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for converting money in Riels to Dollars.");
        System.out.println("\tConversion rate is: 1 USD = 4000 RIELS");
        System.out.print("\tPlease input money in Riels: ");
        int Riels = Integer.parseInt(sc.nextLine());
        System.out.println("\n-------------------------------------------------\n" +
                Riels+ " RIELS = "+ (Riels/RielRatePerDollar)+" USD");
    }
}
