import java.util.Scanner;

public class dortBesKuvvetHesap {
    public static void main(String[] args) {
        int sayi, sayac = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");

        sayi = input.nextInt();
        for (int i = 1, j = i; j <= sayi; j *= 5) {
            System.out.println("4 ün " + sayac + ".kuvveti" + " " + (i *= 4));
            System.out.println("5 in " + sayac + ".kuvveti" + " " + j);
            sayac++;

        }
    }
}
