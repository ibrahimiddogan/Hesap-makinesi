import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi1,sayi2,select;
        double sonuc;
        Scanner alici = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz");
        sayi1 = alici.nextInt();
        System.out.print("2.sayıyı giriniz");
        sayi2 = alici.nextInt();
        System.out.println("1-Toplama işlemi\n2- Çıkarma işlemi\n3-Çarpma işlemi\n4-Bölme işlemi");
        System.out.print("Seçiminiz: ");
        select = alici.nextInt();
        switch (select){
            case 1:
                sonuc = sayi1+sayi2;
                System.out.println("Toplama işlemi sonucunuz: " + sonuc);
                break;
            case 2:
                sonuc=sayi1-sayi2;
                System.out.println("Çıkarma işlemi sonucunuz: " + sonuc);
                break;
            case 3:
                sonuc=sayi1*sayi2;
                System.out.println("Çarpma işlemi sonucunuz: " + sonuc);
                break;
            case 4:
                sonuc=sayi1/sayi2;
                System.out.println("Bölme işlemi sonucunuz: " + sonuc);
                break;
            default:
                System.out.print("Hatalı seçeneği işaretlediniz");
                break;
        }




    }
}