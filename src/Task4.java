import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double costPerSecond = 0.05/60;
        System.out.println("Program for calculating cost of a call.");
        System.out.print("\tPlease input start hours:  ");
        int start_h = Integer.parseInt(sc.nextLine());

        System.out.print("\tPlease input start minutes:  ");
        int start_m = Integer.parseInt(sc.nextLine());

        System.out.print("\tPlease input start seconds:  ");
        int start_s = Integer.parseInt(sc.nextLine());

        System.out.print("\tPlease input end hours:  ");
        int end_h = Integer.parseInt(sc.nextLine());

        System.out.print("\tPlease input end minutes:  ");
        int end_m = Integer.parseInt(sc.nextLine());

        System.out.print("\tPlease input end seconds:  ");
        int end_s = Integer.parseInt(sc.nextLine());

        int duration_h = end_h - start_h;
        int duration_m = end_m - start_m;
        int duration_s = end_s - start_s;

        if (end_h>=start_h) { // End hour must be higher or equal than start hour
            if (end_m < start_m) {
                duration_h = end_h - start_h - 1;
                duration_m = end_m - start_m + 60;

            }
            if (end_s < start_s) {
                duration_m = end_m - start_m - 1;
                duration_s = end_s - start_s + 60;
            }
        }else System.out.println("Invalid input.");

        double costOfCall = (duration_h*3600 + duration_m*60 +duration_s)*costPerSecond;
        String cost_str = String.format("%.4f", costOfCall);

        System.out.println("\n------------------------------------------\n" +
                "\tTotal call duration = " +duration_h+"h " + duration_m+
                "mn " + duration_s+"s");
        System.out.println("\tTotal cost of this call: "+cost_str+"$");
    }
}
