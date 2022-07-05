import java.util.ArrayList;

public class Arrayler {
    public static void main(String[] args) {
        var arrayList=new ArrayList<String>();
        arrayList.add("Kahramanmaraş");
        arrayList.add("Samsun");
        arrayList.add("Ankara");
        arrayList.add("Kütahya");
        arrayList.add("Eskişehir");
        arrayList.add("Dumlupınar");
        //arrayList.remove(0);
        arrayList.set(0, "Sakarya");

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
