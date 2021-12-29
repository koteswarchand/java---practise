import java.util.PriorityQueue;

public class priority {
    
    public void  pque(){

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        //adding elements
        queue.offer(2);
        queue.offer(3);
        queue.offer(1);
        queue.offer(4);
        queue.offer(5);
        queue.add(6);
        System.out.println(queue);

        //System.out.println(queue.size());
        //poll() removings element with highest priority
        queue.poll();
        System.out.println(queue);
        //System.out.println(queue.size());
       
         //removing a specified element
         queue.remove(6);
         System.out.println(queue);

         //contains() checks whether the element is present or not

         System.out.println(queue.contains(1));
    }


    public void adding(){

        //add some elements to the queue

        PriorityQueue<String> queue = new PriorityQueue<String>();

        queue.offer("red");
        queue.offer("yellow");
        queue.offer("blue");
        queue.offer("green");
        queue.offer("orange");

        System.out.println(queue);
    }

    public void looping(){

       
        PriorityQueue<String> queue = new PriorityQueue<String>();

        queue.offer("red");
        queue.offer("yellow");
        queue.offer("blue");
        queue.offer("green");
        queue.offer("orange");

        for(String i : queue){

            System.out.println(i);
        }
   
        System.out.println();
        //method 2 for looping

        queue.forEach(e -> System.out.println(e));

    }

    public void merge(){
      
        //adding one queue to anothe queue
        PriorityQueue<String> queue = new PriorityQueue<String>();

        queue.offer("red");
        queue.offer("yellow");
        queue.offer("blue");
        queue.offer("green");
        queue.offer("orange");
        
        //queue 2
        PriorityQueue<String> queue2 = new PriorityQueue<String>();
        queue2.addAll(queue);
        System.out.println(queue2);
    }

    public void compare(){

        PriorityQueue<String> queue = new PriorityQueue<String>();

        queue.offer("red");
        queue.offer("yellow");
        queue.offer("blue");
        queue.offer("green");
        queue.offer("orange");
       
        System.out.println(queue);
        
        //queue 2
        PriorityQueue<String> queue2 = new PriorityQueue<String>();
        queue2.addAll(queue);
        System.out.println(queue2);

       for(String i : queue2){
           if (queue.contains(i)) {
               System.out.println("yes");
           }
       }
    }

    public static void main(String[] args) {
        
        priority p = new priority();
        //p.pque();
        //p.adding();
        //p.looping();
        p.compare();
    }
}
