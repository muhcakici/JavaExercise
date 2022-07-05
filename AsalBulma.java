public class AsalBulma {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(asalMi(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean asalMi(int a){
        for (int i = 2; i < a; i++) {
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
