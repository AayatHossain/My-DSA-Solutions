import java.util.*;

public class hashMap {
    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Aayat", 1);
        hm.put("Hossain", 2);
        hm.put("Mridha", 3);
        System.out.println(hm);


        //trying to duplicate a key
        // hm.put("Aayat", 6);
        // System.out.println(hm);



        // iterating over a hashset using for each. Use thiis always
        // for(Map.Entry<String, Integer> entry : hm.entrySet()){
        //     System.out.println("Key is: "+ entry.getKey()+" and value is: "+entry.getValue());
        // }

        //iterating over a hashset using iiterator. less important
        // Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
        // for (Map.Entry<String, Integer> entry : entrySet) {
        //     String key = entry.getKey();
        //     Integer value = entry.getValue();
        //     System.out.println("Key: " + key + ", Value: " + value);
        // }


        //cloning hashmap
        // HashMap<String, Integer> originalHashMap = new HashMap<>();
        // originalHashMap.put("Aayat", 1);
        // originalHashMap.put("Hossain", 2);
        // originalHashMap.put("Mridha", 3);

        // // Cloning the HashMap
        // HashMap<String, Integer> clonedHashMap = (HashMap<String, Integer>) originalHashMap.clone();

        // // Modifying the original HashMap
        // originalHashMap.remove("Hossain");

        // // Displaying the elements of both HashMaps
        // System.out.println("Original HashMap: " + originalHashMap);
        // System.out.println("Cloned HashMap: " + clonedHashMap);




        // aadding/puttiing all the elements of hm2 to hm1.
        // HashMap<String, Integer> originalHashMap = new HashMap<>();
        // originalHashMap.put("Aayat", 1);
        // originalHashMap.put("Hossain", 2);

        // HashMap<String, Integer> additionalHashMap = new HashMap<>();
        // additionalHashMap.put("Mridha", 3);
        // additionalHashMap.put("John", 4);

        // // Using putAll to copy mappings from additionalHashMap to originalHashMap
        // originalHashMap.putAll(additionalHashMap);

        // // Displaying the elements of the modified originalHashMap
        // System.out.println("Modified Original HashMap: " + originalHashMap);



        //removing key
        // hm.remove("Aayat");
        // System.out.println(hm);


        // //contains key and val?
        // System.out.println(hm.containsKey("Aayat"));
        // System.out.println(hm.containsValue(3));
        // System.out.println(hm.containsValue(33));

        


        //CHECK IF TWO HASHMAPS ARE EQUAL
         // Creating two HashMaps with equal content
        //  Map<String, Integer> map1 = new HashMap<>();
        //  map1.put("A", 1);
        //  map1.put("B", 2);
 
        //  Map<String, Integer> map2 = new HashMap<>();
        //  map2.put("A", 1);
        //  map2.put("B", 2);
 
        //  // Creating another HashMap with different content
        //  Map<String, Integer> map3 = new HashMap<>();
        //  map3.put("A", 1);
        //  map3.put("B", 3);
 
        //  // Using equals to compare maps
        //  boolean areEqual1and2 = map1.equals(map2);
        //  boolean areEqual1and3 = map1.equals(map3);
 
        //  System.out.println("Are map1 and map2 equal? " + areEqual1and2); // Output: true
        //  System.out.println("Are map1 and map3 equal? " + areEqual1and3); // Output: false




        //use of getOrDefault
        // System.out.println(hm.get("Aayat"));
        //         //frequency of aayat increased by one
        // hm.put("Aayat", hm.getOrDefault("Aayat", 0)+1);
        //         //bruh has no assigned values, so bruh is assiigned a default value of 5.
        // hm.put("bruh", hm.getOrDefault("bruh", 5));
        // System.out.println(hm);


        //size
        // System.out.println(hm.size());
       


    }
}
