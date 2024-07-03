import java.util.*;
public class stack {
    public static void main(String[] args) {
        st();
    }

    static void st() {
        Stack<Integer> sta = new Stack<>();
        Stack<Integer> stak = new Stack<>();
        sta.push(15);
        sta.push(11);
        sta.push(31);
        sta.push(4);

        for (int nums : sta) {
            stak.add(0,nums );
            System.out.println(stak);
        }
    }
    
}
