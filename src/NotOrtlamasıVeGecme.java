import java.util.Scanner;
public class NotOrtlamasıVeGecme {
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);
        int mat, fiz, turkce, kimya, muzik;
        int totalClass = 0;
        int average ;
        int totalPoint = 0;

        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        if (!(mat < 0 || mat > 100 ))
        {totalPoint += mat;
            totalClass++;}

        System.out.print("Fizik notunuzu giriniz : ");
        fiz = input.nextInt();
        if (!(fiz < 0 || fiz > 100 ))
        {totalPoint += fiz;
            totalClass++;}


        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        if (!(turkce < 0 || turkce > 100 ))
        {totalPoint += turkce;
            totalClass++;}


        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        if (!(kimya < 0 || kimya > 100 ))
        {totalPoint += kimya;
            totalClass++;}


        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();
        if (!(muzik < 0 || muzik > 100 ))
        {totalPoint += muzik;
            totalClass++;}

        average = totalPoint / totalClass ;

        if (average < 55)
        {
            System.out.println("Sınıfı Geçemediniz! Ortalamanız :  "+ average);
        } else {
            System.out.println("Tebrikler sınıfı geçtiniz! Ortalamanız : "+ average);
        }
    }
}
