import java.util.*;

public class queue {
    public static void main(String[] args) {
        que();

    }

    static void que() {
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(1);
        qu.offer(21);
        qu.offer(3);

        System.out.println(qu);
    }
    
}
