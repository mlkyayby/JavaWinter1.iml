package day52_maps;

import day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C02_Update {
    public static void main(String[] args) {
        // verilen map teki tum branslari java yapalim

        /*
        Map te value compleks olabildigi icin value icerisinden
         */

        Map<Integer,String> sinifListMap= MapOlustur.myMap();
        System.out.println(sinifListMap);

        Set<Map.Entry<Integer,String>>sinifEntrySet=sinifListMap.entrySet();
        for (Map.Entry<Integer,String>each: sinifEntrySet
             ) {
            Integer keyEntry = each.getKey();
            String valueEntry = each.getValue();
            ;

            String valueArr[] = valueEntry.split(", ");
            valueArr[2] = "Java";
            String valueYeni = valueArr[0] + ", " + valueArr[1] + ", " + valueArr[2] + ", " + valueArr[3];

            sinifListMap.put(keyEntry,valueYeni);

        }
        System.out.println(sinifListMap);
    }
}
