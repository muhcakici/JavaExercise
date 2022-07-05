import java.util.Scanner;

public class SayidakiBuyukRakam {
    public static void main(String[] args) {

        int max = 0;
        int min = 10;
        Scanner scan = new Scanner(System.in); 
        System.out.print("Sayı giriniz: ");
        String sayi = scan.next(); 
        String[] rakamlar = sayi.split("");     
        for (int i = 0; i < rakamlar.length; i++) {             
            if (Integer.parseInt(rakamlar[i]) > max) {
                max = Integer.parseInt(rakamlar[i]);
            } else if (Integer.parseInt(rakamlar[i]) < min) {
                min = Integer.parseInt(rakamlar[i]);
            }
        }
        System.out.println("En büyük rakam: " + max);
        System.out.println("En küçük rakam: " + min);
        scan.close();
    }
}

