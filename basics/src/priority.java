import java.util.PriorityQueue;

public class priority {
    public static void main(String[] args) {
        pqe();
    }

    static void pqe() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(23);
        pq.add(3);
        pq.add(2);
        pq.add(23);
        pq.add(344);
        pq.add(2);

        System.out.println(pq);
        while (pq.size() != 0) {
            pq.poll();
            System.out.println(pq);
        }
    }
}
