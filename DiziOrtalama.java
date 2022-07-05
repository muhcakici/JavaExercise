public class DiziOrtalama {
    public static void main(String[] args) {
        int [] array={20,20,40,80};
        System.out.println("Ortalamaları: "+ortalamaBul(array));
    }
    public static double ortalamaBul(int[] arr){
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
        }
        return toplam/arr.length;
    }
}
