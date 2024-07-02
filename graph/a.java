import java.util.*;


public class a {




    public static void main(String args[]) {

    //foreach in hashmap
     HashMap<Integer, String> hm = new HashMap<>();
     hm.put(0, "Aayat");     
     hm.put(1, "Shifat");
     hm.put(222222, "Jharna");
     hm.put(3, "fateha");
     hm.put(4, "hafeza");
     
    // for(Integer k: hm.keySet()){
    //     System.out.println(hm.get(k));
    // }

    for (Map.Entry<Integer, String> entry : hm.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }


    //foreach in arraylist
    ArrayList<String> a = new ArrayList<>();
    a.add("a");
    a.add("b");
    a.add("c");
    a.add("d");

    for(String s: a){
        System.out.println(s);
    }




    }
}