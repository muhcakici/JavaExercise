import java.util.Scanner;

public class DiziOlustur {
    public static void main(String[] args) {
        int [] arr=new int[5];
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+" indexdeki değeri giriniz:");
            arr[i]=scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        scan.close();
    }
}
