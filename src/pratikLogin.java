import java.time.Year;
import java.util.Scanner;
public class pratikLogin {
    public static void main(String[] Args) {
        String userName, password, newpassport
        , reset;
        Scanner inp = new Scanner(System.in);
        System.out.print(" Kullanıcı adını girin : ");
        userName = inp.nextLine();

        System.out.print("Şifrenizi girin");
        password = inp.nextLine();

        if (userName.equals("merthendekci") && password.equals("yildiz1992")) {
            System.out.println("başarılı giriş");
        } else {
            System.out.println("Başarısız deneme! Şifre Yenilemek ister misiniz? \"yes\" /  \"no\" ");
            reset = inp.nextLine();

            if (reset.equals("yes")) {
                System.out.print("Yeni şifrenizi Giriniz : ");
                newpassport = inp.nextLine();
                if (newpassport.equals("yildiz1992") || newpassport.equals("password")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    newpassport = inp.nextLine();
                    {
                        if (newpassport.equals("yildiz1992") || newpassport.equals("password")) {
                            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                            newpassport = inp.nextLine();
                        } else {
                            System.out.println("Şifre oluşturuldu");
                        }
                    }
                } else {
                    System.out.println("Şifre oluşturuldu");
                }

           /* switch (reset) {
                case 1 :
                    System.out.println( "Yeni şifrenizi Giriniz");
                    newpassport = inp.nextLine ();
                    if (newpassport.equals("yildiz1992") || newpassport.equals("password")){
                        System.out.println("şifre oluşturuldu");}else{
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");}
                    break; */
            }
        }
    }
}


