import java.util.Scanner;

public class Fakt {
    public static void main(String[] args) {
        //for ile
        /*Scanner scan=new Scanner(System.in);
        System.out.println("Sayi:");
        int sayi=scan.nextInt();
        int fact=1;
        for (int i = 1; i <= sayi; i++) {
            fact*=i;
        }
        System.out.println("Faktoriyeli:"+fact);
*/

        //while ile 
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi:");
        int sayi=scan.nextInt();
        int fact=1;
        while (sayi>0) {
            fact*=sayi;
            sayi--;
        }
        System.out.println("Faktoriyeli:"+fact);
        scan.close();
    }

}
