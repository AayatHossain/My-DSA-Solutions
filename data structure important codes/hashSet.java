
import java.util.*;

public class hashSet {
    public static void main(String args[]){
        HashSet<String> hs = new HashSet<>();

        hs.add("Aayat");
        hs.add("Hossain");
        hs.add("Mridha");
        System.out.println(hs);


        // //puttiing the same string
        // hs.add("Aayat");
        // System.out.println(hs);
        
        // //iterating hashset using foreach. not possible to print hs using for loop.
        // for(String s: hs){
        //     System.out.println(s);
        // }

        //hashset to other ds
            //list
        // List<String> list = new ArrayList<>();
        // list.addAll(hs);
        // System.err.println(list);
        
            //queue
        // Queue<String> q = new LinkedList<>();
        // q.addAll(hs);
        // System.out.println(q);

        //contanis?
        // for(String s: hs){
        //     if(hs.contains("Aayat")){
        //         //whole hashset is printed because aayat is always there.
        //         System.out.println(s);
        //     }
        // }
        // for(String s: hs){
        //     //now only aayaat is priinted.
        //     if(s == "Aayat"){
        //         System.out.println(s);
        //     }
        // }

        //CLONING A HASHSET
        // HashSet<String> originalHashSet = new HashSet<>();
        // originalHashSet.add("Value1");
        // originalHashSet.add("Value2");
        // originalHashSet.add("Value3");

        // HashSet<String> clonedHashSet = (HashSet<String>) originalHashSet.clone();

        // originalHashSet.remove("Value2");

        // System.out.println("Original HashSet: " + originalHashSet);
        // System.out.println("Cloned HashSet: " + clonedHashSet);

        //REMOVING AN ELEMENT
        // hs.remove("Aayat");
        // System.out.println(hs);











    }
}
