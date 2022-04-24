package day52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {
        Map<String,Integer> myMap=new HashMap<>();
        myMap.put("H",3);
        myMap.putIfAbsent("K", 5);
        // bir ekleme yapmak istedigimizde key daha once eklenmisse map e eklensin
        // daha onceden eklenmisse eskiyi silmemek icin bizi uyarsin

        System.out.println(myMap.putIfAbsent("A",6));

        if (myMap.putIfAbsent("K",20)!= null){
            System.out.println("girdiginiz key zaten map te var");
        }

        System.out.println(myMap);

        myMap.put("A",10);
        System.out.println(myMap);

        myMap.computeIfAbsent("A",v->20);
        System.out.println(myMap);

        myMap.compute("A" ,(key,value)-> 20);

        //H nin dgerini 2 katinin 5 fazlasi yapalim
        myMap.compute("H",(key , value) ->(2*value+5));
        System.out.println(myMap);





    }
}
