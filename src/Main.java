import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, newPassword;
        int cevap;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanici adini giriniz:");
        userName = inp.nextLine();
        System.out.print("Sifre giriniz:");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giris yaptiniz!!");
        } else {
            System.out.println("Yanlis giris yaptiniz.??");
            System.out.print("Sifrenizi sifirlamak istiyorsaniz '1' istemiyorsaniz '2' tusuna basiniz:");
            cevap = inp.nextInt();
            switch (cevap) {
                case 1:
                    System.out.print("Yeni sifrenizi giriniz:");
                    Scanner inp2 = new Scanner(System.in);
                    newPassword = inp2.nextLine();
                    if (newPassword.equals("java123")||newPassword.equals(password)){
                        System.out.println("Sifre olusturulmadi");
                    }else {
                        System.out.println("Sifre olusturuldu");
                    }
                    break;
                case 2:
                    System.out.println("Sifre sifirlamak istemediniz?");
                    System.out.println("==============================");
                    break;
                default:
                    System.out.println("Yanlis giris yaptınız");



            }


        }


    }
}
