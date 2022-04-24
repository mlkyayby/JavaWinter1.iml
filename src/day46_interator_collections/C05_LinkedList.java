package day46_interator_collections;

import java.util.LinkedList;

public class C05_LinkedList {
    public static void main(String[] args) {
        //hem list hemde queue nin child classtir
        LinkedList<Integer>list=new LinkedList<>();
        list.add(5);
        list.add(10);//add methodu list den geldigi icin hep sona eklenir
        list.addFirst(11);//addFirst deque den gelir
        list.addLast(12);//addLast deque den elir
        System.out.println(list);

        list.add(2,25);
        System.out.println(list);
    }
}
