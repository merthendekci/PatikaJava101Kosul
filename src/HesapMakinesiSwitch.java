import java.util.Scanner;
public class HesapMakinesiSwitch {
    public static void main(String[] Args) {
        Scanner inp = new Scanner(System.in);
        double a, b;

        System.out.println("Sayı Giriniz");
        a = inp.nextDouble();
        System.out.println("Sayı giriniz");
        b = inp.nextDouble();
        System.out.println("1 - toplama \n2 - Çıkartma \n3 - Bölme \n4 - Çarpma ");
        int sign = inp.nextInt();

        switch (sign) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Bir sayı sıfıra bölünemez");
                }
                break;
            case 4:
                System.out.println(a * b);
                break;
            default:
                System.out.println("lütfen geçerli bir değer giriniz");
        }
    }
}