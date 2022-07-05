import java.util.Scanner;

public class UserEntrance {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String ad="mami";
        String parola="123";
        int hak=3;
        while (true) {
            System.out.println("Kullanıcı adı:");
            String okunanAd=scan.nextLine();
            System.out.println("Parola:");
            String okunanParola=scan.nextLine();
            if(okunanAd.equals(ad)&& okunanParola.equals(parola)){
                System.out.println("Hoşgeldiniz...");
                break;
            }
            else if(okunanAd.equals(ad)&& !okunanParola.equals(parola)){
                System.out.println("Parola Hatalı");
                hak--;
                System.out.println(hak+" hakkınız kaldı!");
            }
            else if(!okunanAd.equals(ad)&& okunanParola.equals(parola)){
                System.out.println("Kullanıcı Adı Hatalı");
                hak--;
                System.out.println(hak+" hakkınız kaldı!");
            }
            else{
                System.out.println("Kullanıcı adı ve Parola hatalı!");
                hak--;
                System.out.println(hak+" hakkınız kaldı!");
            }
            if(hak==0){
                System.out.println("Giriş hakkı bitti...");
                break;
            }
        }
        scan.close();
    }
}
