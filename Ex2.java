package JavaHW4;

import java.util.LinkedList;
import java.util.Scanner;

/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.*/
public class Ex2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("facebook");
        list.add("google");
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Enqueue " +
                            "\n2: Dequeue " +
                            "\n3: First ");
        System.out.println(list);
        int operation = sc.nextInt();
        String result = getOperation(operation, list);

        }

    public static String getOperation(int operation, LinkedList<String> result) {

        switch (operation) {
            case 1:
                result = Enqueue(result);
                System.out.println(result);
                break;
            case 2:
                result = Dequeue(result);
                System.out.println(result);
                break;
            case 3:
                String temp = First(result);
                System.out.println(temp);
                break;
        }
        return result.toString();
    }

    public static LinkedList<String> Enqueue (LinkedList<String> list) {
        list.add("Yandex");
        return list;
    }

    public static LinkedList<String> Dequeue (LinkedList<String> list) {
        System.out.println(list.pollFirst());
        return list;
    }

    public static String First (LinkedList<String> list) {
        String temp = list.getFirst();
        return temp;
    }
}


