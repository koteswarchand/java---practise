import java.util.LinkedList;
import java.util.List;

public class Primeplain {
    
    public boolean isPrime( int num){
    /*method to check whether the number
    is prime or not*/
         int count = 0;
         for(int i = 1; i <= num; i++){
              if(num % i == 0){
                  count++;  
              }    
         }
         if(count == 2){
             return true;
         }
         return false;
    }

    public void pp(){
     /*method to check whether the number
    is prime and palindrome*/
         List<Integer> a = new LinkedList<Integer>();
         a.add(11);
         a.add(23);
         a.add(56);
         a.add(434);
         a.add(55);
        /*converting the list into streams and using fileter(action)
        for filtering out in the list, this will work same for arrays */
         a.stream().filter(e -> (isPrime(e) && isPalindrome(e))).forEach(System.out::println);
    }

    public boolean isPalindrome(int num){
     /*method to check whether the number
    is palindrome  or not*/
        String n = num + "";
        String res = "";
        for(int i = n.length() - 1; i >= 0; i--){
            res = res + n.charAt(i);
        }
        int op = Integer.valueOf(res);
        if(op == num){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Primeplain p = new Primeplain();
       // p.isPrime(2);
       p.pp();

    }
}
