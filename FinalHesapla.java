import java.util.Scanner;

public class FinalHesapla {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Vize:");
        double vizeNot=scan.nextDouble();
        System.out.println("Final:");
        double finalNot=scan.nextDouble();
        double sonuc=(vizeNot*0.4)+(finalNot*0.6);
        System.out.println("Final Notu:"+sonuc);
        if(sonuc<=20){
            System.out.println("Kaldı");
        }else if(sonuc>20){
            System.out.println("DD");
        }else if(sonuc>40){
            System.out.println("CC");
        }else if(sonuc>60){
            System.out.println("BB");
        }else if(sonuc>80){
            System.out.println("AA");
        }
        scan.close();
    }
}
