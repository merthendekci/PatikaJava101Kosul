import java.util.Scanner;
public class hesapMakinesiIf {
    public static void main(String[]Args) {
        double a, b, sign;

        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı Giriniz");
        a = inp.nextDouble();
        System.out.println("Sayı giriniz");
        b = inp.nextDouble();
        System.out.println("1 - toplama \n2 - Çıkartma \n3 - Bölme \n4 - Çarpma ");
        sign = inp.nextDouble();

        if (sign == 1) {
            System.out.println(a + b);
        } else if (sign == 2) {
            System.out.println(a - b);
        } else if (sign == 3) {
            if (b != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("Bir sayı sıfıra bölünemez");
            }
        } else if (sign == 4) {
            System.out.println(a * b);
        } else {
            System.out.println("lütfen geçerli bir değer giriniz");
        }
    }
}