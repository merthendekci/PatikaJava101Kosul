import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] Args) {
        int km, age,way; double wayPrice;

        Scanner inp = new Scanner(System.in);

        System.out.print("Distance : ");
        km = inp.nextInt();

        System.out.print("Age : ");
        age = inp.nextInt();

        System.out.print(" 1 - One way - 2 - Round Trip :");
        way = inp.nextInt();
        wayPrice = (way == 1) ? 1 : 1.6;

        double total = (km * 0.1) * wayPrice;
        double u12      = total * .50;
        double ogrenci  = total * .90;
        double o65      = total * .70;

        if (km < 0 || age < 0 || !(way == 1 || way == 2)) {
            System.out.println("Hatalı veri girdiniz");
        } else if (age < 12) {
            System.out.println("Toplam Tutar : " + u12);
        } else if (age <= 24) {
            System.out.println("Toplam Tutar : " + ogrenci);
        } else if (age >65) {
            System.out.println("Toplam Tutar : " + o65);
        } else {
            System.out.println("Toplam tutar : " + total);
        }
    }
}
