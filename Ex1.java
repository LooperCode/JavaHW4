package JavaHW4;

import java.util.Deque;
import java.util.LinkedList;

/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.*/
public class Ex1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("hello");
        ll.add("world");
        ll.add("Im here");
        System.out.println(ll);
        System.out.println(reverseList(ll));
    }

public static Deque<String> reverseList (LinkedList<String> list) {
    Deque<String> deque = new LinkedList<>();
    for (int i = 0; i < list.size(); i++) {
        deque.addFirst(list.get(i));
    }
    return deque;
}
}
