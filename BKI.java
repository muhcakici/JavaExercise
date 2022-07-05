import java.util.Scanner;

public class BKI {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Boy: ");
        double boy=scan.nextDouble();
        System.out.println("Kilo: ");
        int kilo=scan.nextInt();
        double bki=kilo/(boy*boy);
        System.out.println("Bki:"+bki);
        scan.close();
    }
}
