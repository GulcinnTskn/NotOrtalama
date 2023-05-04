import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int mat,fizik,kimya,turkce,muzik,tarih;

        Scanner input= new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunu Giriniz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunu Giriniz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunu Giriniz : ");
        turkce = input.nextInt();

        System.out.print("Müzik Notunu Giriniz : ");
        muzik = input.nextInt();

        System.out.print("Tarih Notunu Giriniz : ");
        tarih = input.nextInt();

        int toplam = (mat+fizik+kimya+tarih+turkce+muzik);
        double sonuc = toplam/6.0;

        System.out.print("Not Ortalamanız : ");
        System.out.println(sonuc);

     System.out.println(sonuc>=60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız");



    }
}