package day46_interator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02_listeninElementleriniArttirma {
    public static void main(String[] args) {
        //verilen listedeki her elementi 3 arttiralim
        List<Integer> liste= new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        System.out.println(liste);
        // Listenin tum elementlerini bize getirmesi icin iterator un hasNext() ve next() methodlarini beraber
        //kullanacaz

      ListIterator itr=liste.listIterator();

        while(itr.hasNext()){//yaninda elment old mudettce calisacak
           Object sayi= itr.next();
            itr.set((Integer)sayi+3);

        }
        System.out.println(liste);

    }
}
