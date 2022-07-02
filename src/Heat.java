import java.util.Scanner;
public class Heat {
    public static void main(String[] Args) {
        int heat;
        Scanner inp = new Scanner(System.in);
        System.out.println("What is the temperature ?");
        heat = inp.nextInt();
        if (heat < 5) {
            System.out.println(" Go to Ski");
        } else if (heat == 5) {
            System.out.println("Go to Ski or Cinema");
        } else if (heat > 5 && heat < 15) {
            System.out.println("Go to Cinema");
        } else if (heat == 15) {
            System.out.println("Go to Cinema or Picnic");
        } else if (heat > 15 && heat < 25) {
            System.out.println("Go to Picnic");
        } else if (heat == 25) {
            System.out.println("Go to Picnic or Swimming");
        } else System.out.println("Go to Swimming");
    }
}
