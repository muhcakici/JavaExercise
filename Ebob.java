import java.util.Scanner;

public class Ebob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk sayi:");
        int sayi1=scan.nextInt();
        System.out.println("İkinci sayi:");
        int sayi2=scan.nextInt();
        int sonuc=ebobBul(sayi1, sayi2);
        System.out.println("Girilen sayiların ebobu: "+sonuc);
        scan.close();
    }
    public static int ebobBul(int a,int b){
        int ebob=1;
        for (int i = 1; i <= a && i<=b; i++) {
            if(a%i==0 && b%i==0){
                ebob=i;
            }
        }
        return ebob;
    }
}
