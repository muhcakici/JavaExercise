import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListe {
    public static void main(String[] args) {
        var sehirler=new LinkedList<String>();
        sehirler.add("Sakarya");
        sehirler.add("Dumlupınar");
        sehirler.add("Eskişehir");
        sehirler.add("Kütahya");
        sehirler.remove(3);
        sehirler.add("Ankara");
        goster(sehirler);

    }
    public static void goster(LinkedList<String>sehirler){
        ListIterator<String> itr=sehirler.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(itr.previous());
    }
}
