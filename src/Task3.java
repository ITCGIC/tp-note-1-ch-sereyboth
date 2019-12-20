import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Program for converting time to seconds.");
        System.out.print("\tPlease input hours:  ");
        int h = Integer.parseInt(sc.nextLine());

        System.out.print("\tPlease input minutes:  ");
        int m = Integer.parseInt(sc.nextLine());

        System.out.print("\tPlease input seconds:  ");
        int s = Integer.parseInt(sc.nextLine());

        System.out.println("\n------------------------------------------\n" +
                "\tNumber of seconds = " + h+"x3600 + "+m+"x60 + "+s+" = "+
                (h*3600 + m*60 +s));

    }
}
