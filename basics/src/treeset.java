import java.util.*;
public class treeset {
    public static void main(String[] args) {
        hset();
    }

    static void hset() {
        TreeSet<Integer> hs = new TreeSet<>();
        hs.add(1);
        hs.add(212);
        hs.add(113);
        hs.add(23);

        System.out.println(hs);

        hs.add(1);
        System.out.println(hs.size());
    }
}



