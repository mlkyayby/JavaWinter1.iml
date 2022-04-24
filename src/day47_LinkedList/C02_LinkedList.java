package day47_LinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        //listten gelen ozellikleri biliyoruz onun icin deque den gelen ozeliklere bakalaim

        Deque<Integer> ll1=new LinkedList<>();
        ll1.addFirst(10);// basa method ekler add methoduna gore daha hizlidir
        ll1.addLast(20);//sona element ekler add ten daha hizli
        System.out.println(ll1);
        System.out.println(ll1.element());//ilk elementi silmeden bize dondurur
        //ilk element yoksa exception firlatir
        System.out.println(ll1);
        System.out.println(ll1.getLast());//son elementi silmeden bize dondurur
        System.out.println(ll1.getFirst());//ilk elementi silmeden bize dondurur

        ll1.offer(30);//ekledigi elementi dondurur sona ekler
        System.out.println(ll1);
        ll1.offerLast(40);//sona ekler ve bize true dondurur
        System.out.println(ll1);
        ll1.offerFirst(50);
        System.out.println(ll1);

        System.out.println(ll1.peek());// ilk elementi silmeden bize dondurur,
        // bulamazsa null dondurur

    }
}
