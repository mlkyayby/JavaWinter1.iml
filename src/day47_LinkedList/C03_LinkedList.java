package day47_LinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        Deque<Integer> ll1=new LinkedList<>();
        System.out.println(ll1.peek());
        //bosken kullanirsak null dondururu
        System.out.println(ll1.poll());
        System.out.println(ll1.pollFirst());
        System.out.println(ll1.pollLast());//bastaki elementi dondurur yoksa null dondurur
        ll1.pop();//ilk elementi silip bize dondurur
        // ilk elementi bulamazsa exception firllatir
        ll1.push(30);//listenin basina bir element ekler
        ll1.push(30);
        System.out.println(ll1);

        System.out.println(ll1.remove()); //ilk elementi siler ve bize dondurur

        ll1.push( 40);
        ll1.push(50);
        ll1.remove(50);
        System.out.println(ll1);
        ll1.removeLastOccurrence(30);// son kullanilan elementi siler
        System.out.println(ll1);
        ll1.removeFirstOccurrence(30);
        System.out.println(ll1);

    }
}
