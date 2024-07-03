
import java.util.*;

class Arraylist {
    public static void main(String[] args) {
        arrayls();
        }
        static void arrayls(){
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> ls = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);

            int prat = list.get(3);
            System.out.println(prat);

            for (int num : list) {
                ls.add(0, num);
                System.out.println(num);
            }
            System.out.println("reverse");
            for (int num : ls) {
                
                System.out.println(num);
            }
            list.remove(3);

            System.out.println(list);
            System.out.println(ls);
        }
    }
