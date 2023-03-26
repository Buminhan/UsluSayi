import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        int taban, us, uslusayi=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Taban sayıyı giriniz.");
        taban =s.nextInt();
        System.out.println("Sayının üssünü giriniz.");
        us = s.nextInt();
        for(int i = 1;i<=us;i++){
            uslusayi *= taban;
        }
        System.out.println(taban+" üssü "+us+" = "+uslusayi);
    }
}
