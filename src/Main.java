import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, query;
        Scanner sc= new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName = sc.nextLine();
        System.out.print("Şifreniz         : ");
        password = sc.nextLine();


        if (userName.equals("firat") && password.equals("123")){
            System.out.println("Giriş yaptınız!");
        }else {
            System.out.println("Bilgileriniz yanlış!");
            System.out.println("Şifrenizi sıfırlamak istiyormusunuz?\n evet \n hayır");
            System.out.print("Şifre Değişsin mi? : ");
            query = sc.nextLine();
            switch (query){
                case "evet":
                    System.out.println("Yeni şifre giriniz : ");
                    password = sc.nextLine();
                    if ( ! password.equals("123") && !password.equals(password)){
                        System.out.println("Şifre oluşturuldu");
                    }else {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                    break;
                case "hayır":
                    System.out.println("Lütfen tekrar giriş yapmayı deneyin.");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız. Lütfen daha sonra tekrar deneyin.");
            }
        }
    }
}