import java.util.*;

public class maps {
    
    public void sample(){

        //creating maps
        HashMap<Integer,String> map = new HashMap<Integer,String>();

        //push(key, value) is used to add values
        map.put(1, "john");
        map.put(2, "jonas");
        map.put(3, "blake");
        map.put(4, "richard");
        map.put(5, "brown");
        map.put(6, "ragnar");
        map.put(7, "bjorn");
        System.out.println(map);
  
        //retrieving all the values
        System.out.println(map.values());
        
        //retrieving all the keys
        System.out.println(map.keySet());

        //removing a key value pair using a key
        map.remove(6);
        System.out.println(map);

        //removing a key value pair using both key and value
        map.remove(7, "bjorn");
        System.out.println(map);

        //replacing a value using key replace(key, new_value)
        map.replace(5,"eren");
        System.out.println(map.values());

        //replacing the value with new value using replace(key, old_value, new_value)
        map.replace(5,"eren","eren yaegar");
        System.out.println(map);

        //contansKey(key) checks whether the key is present or not
        System.out.println(map.containsKey(1));

        //containsValue(value) checks whether the value is present or not
        System.out.println(map.containsValue("eren"));

        //retrieving a value using key [map.get(key)]
        System.out.println(map.get(1));

        //size of the map
        System.out.println(map.size());

        //looping through the map
        for(Map.Entry<Integer,String> m : map.entrySet()){

            System.out.println(m.getKey() +" "+ m.getValue());
        }

        //method 2 for looping through the map
        map.forEach((k,v) -> System.out.println(k +" " +v));


    }

    public static void main(String[] args) {
        
        maps m = new maps();
        m.sample();
    }
}
