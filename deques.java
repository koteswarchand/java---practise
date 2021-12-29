import java.util.ArrayDeque;
import java.util.Deque;

public class deques {

    public void dequ(){

        Deque<Integer> dq = new ArrayDeque<Integer>();

        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.add(4);
        dq.add(5);

        System.out.println(dq);

        /* dequeue has a speciality , that we can
        add elements at the end or at the begining same goes
        with poping out elements*/

        //addFirst()

        dq.addFirst(0);

        dq.addLast(6);

        //pollFirst() removes first element or else poll() as per queue

        dq.pollFirst();

        System.out.println(dq);

        dq.pollLast();

        System.out.println(dq);

        System.out.println(dq);
    }

    public static void main(String[] args) {
        
        deques d = new deques();
        d.dequ();
    }
}
