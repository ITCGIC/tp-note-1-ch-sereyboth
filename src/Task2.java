import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for converting seconds into formated H:M:S");
        System.out.print("\tInput number of seconds: ");
        int seconds = Integer.parseInt(sc.nextLine());

        int H = seconds/3600;
        int M = (seconds%3600)/60;
        int S = seconds % 60;

        System.out.println("\tTime corresponding to " + seconds +"seconds is " +
                H + ":" + M + ":" + S +".");

    }
}
