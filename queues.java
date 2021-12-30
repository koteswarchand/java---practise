import java.util.stream.Collectors;
import java.util.*;

public class queues {
    
    //creating multiple queue objects
    //queue methods
    public void que(){
  
        //intialising queue 
        //queue can implemented using arraylist or linked list
        Queue<Integer> queue = new LinkedList<Integer>(); //queue object 1

        //inserting elements using offer(), if capacity is full returns false
        /* we can also use add() for 
         inserting ,but it returns exception if violating capacity*/
        queue.offer(0);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        System.out.println(queue);

        /* poll() first in first out 
        removes the first element  */

        queue.poll();
        System.out.println(queue);

        /* peek() retrieves the top-most element from
        the queue, in queue the top most element is
        the first element unlike stack */
        System.out.println(queue.peek());
        
       //removing a specified element from the queue
       queue.remove(6);
       System.out.println(queue);

       //contains() checks whether the element is present or not
       //if present returns true or in absence returns false
       System.out.println(queue.contains(1));
       
       //size() returns the size of  queue 
       System.out.println(queue.size());

      //looping through queue
      queue.forEach(e -> System.out.println(e) );

     //retrieving a specified element
     
     System.out.println(queue.stream().collect(Collectors.toList()).get(1));
    }

    public void dummy(){
        Queue<Integer> q = new ArrayDeque<Integer>(); //queue object 2
           q.offer(1);
           q.offer(2);
           q.offer(3);
           q.offer(4);
           q.offer(5);
            System.out.println(q);

    
    }

    public void dummy2(){

        Queue<Integer> list = new ArrayDeque<Integer>(); //queue object 2
        list.offer(34);
        list.offer(35);
        list.offer(36);
        list.offer(37);
        list.add(38);

        System.out.print(list);
    }

    public static void main(String[] args) {
        
        queues q = new queues();
        q.que();
    }
}
