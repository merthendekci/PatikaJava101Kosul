import java.util.Scanner;
public class ArtikYil {
    public static void main(String [] Arg){
        int year; double mod;
        Scanner inp = new Scanner(System.in);
        System.out.println("Year : ");
        year= inp.nextInt();
        mod = year%4;
        if (mod == 0) {
            System.out.println(year + " bir artık yıldır.");
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }
    }
}
