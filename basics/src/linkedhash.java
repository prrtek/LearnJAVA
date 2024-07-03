import java.util.*;
public class linkedhash {
    public static void main(String[] args) {
        hset();
    }

    static void hset() {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        hs.add(1);
        hs.add(212);
        hs.add(113);
        hs.add(23);

        System.out.println(hs);

        hs.add(1);
        System.out.println(hs.size());
    }
}


