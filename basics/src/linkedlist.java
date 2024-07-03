import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        ll();
    }

    static void ll() {
        LinkedList<Integer> link = new LinkedList<>();
        LinkedList<Integer> lk = new LinkedList<>();
        link.add(144);
        link.add(14);
        link.add(13);
        link.add(14);
        link.add(31);
        link.add(6);

        link.remove(3);
        for (int nums : link) {
            lk.add(0, nums);
            System.out.println(lk);
        }
    }
}
