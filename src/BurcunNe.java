import java.util.Scanner;
public class BurcunNe {
    public static void main (String[] Args) {
        int month , days ;
        String burc = "";
        Scanner inp = new Scanner(System.in);
        System.out.print("What is your birth month : ");
        month=inp.nextInt();
        System.out.print("What is your birthday : ");
        days= inp.nextInt();
        if (!(month > 0 && month < 4)) {
            System.out.println("Geçersiz bir ay girdiniz");
        } else if (! (days > 0 && days < 31)) {
            System.out.println("Geçersiz bir gün girdiniz");
        } else if ((month == 1 && days < 22) || (month == 12 && days > 22)) {
            System.out.println( "Oğlak Burcusunuz");
        } else if ((month == 2 && days < 20) || (month == 1 && days > 21)) {
            System.out.println( "Kova Burcusunuz");
        }else if ((month == 3 && days < 21) || (month == 2 && days > 19)) {
            System.out.println( "Balık Burcusunuz");
        }
    }
}
