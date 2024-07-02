import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
public class list {
    public static void main(String args[]){
        
//IMPORTANT OPERATIONS   IMPORTANT OPERATIONS   IMPORTANT OPERATIONS   IMPORTANT OPERATIONS   IMPORTANT OPERATIONS   IMPORTANT OPERATIONS   IMPORTANT OPERATIONS   

        //MAKING LIST1 USING ARRAYLIST. this list is used as an example for various operations so dont comment it out.
        List<String> list1 = new ArrayList<>();
        list1.add("Aayat");
        list1.add("Hossain");
        list1.add("mridha");
        // System.out.println(list1);



        //ITERATING OVER LIST1 

        // for(String name: list1){
        //     System.out.println(name);
        // }
        // for(int i = 0; i < list1.size(); i++){
        //     System.out.println(list1.get(i));
        // }

        //CONVERTIING LIST1 TO AN ARRAY
        // String arr[] = new String[list1.size()];
        // list1.toArray(arr);
        // System.out.println(arr.length);
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }


        //Array to List
        // Integer[] arr1 = {1,3,5,7,9};
        // List<Integer> list3 = Arrays.asList(arr1);
        // System.out.println(list3);


       








        //adding all elements at the end of a list           // important that we cannot use addAll with array[], because array[] is not a collection.
        
        //list to list

        // List<String> list4 = new ArrayList<>();
        // list4.add("Amazing");
        // list4.add("uff");
        // list4.add("omg");
        // System.out.println(list1);
        // list1.addAll(list4);
        // System.out.println(list1);





        //queue to list

        // Queue<String> q = new LinkedList<>();
        // q.add("123");
        // q.add("beautiful");
        // q.add("master");
        // System.out.println(list1);
        // list1.addAll(q);
        // System.out.println(list1);





        //hashset to list, orders may be different for hashcodes

        // HashSet<String> hs = new HashSet<>();
        // hs.add("lets go");
        // hs.add("i wont go");
        // hs.add("you go alone");
        // System.out.println(list1);
        // list1.addAll(hs);
        // System.out.println(list1);






        //hashmap to list

        // HashMap<String, Integer> hm = new HashMap<>();
        // hm.put("best", 1);
        // hm.put("lame", 3);
        // hm.put("worst", 2);
        // List<Map.Entry<String, Integer>> list5 = new ArrayList<>();
        // list5.addAll(hm.entrySet());
        // System.out.println("List: " + list5);





       



        //clearing a list
        // System.out.println(list1);
        // list1.clear();
        // System.out.println(list1);




         //COMPARE TWO LISTS
        //  List<String> list5 = new ArrayList<>();
        //  list5.add("apple");
        //  list5.add("banana");
        //  list5.add("cherry");
 
        //  List<String> list6 = new ArrayList<>();
        //  list6.add("apple");
        //  list6.add("cherry");
        //  list6.add("banana");

        //  System.out.println(list5.equals(list6));



        //does it contain?
        // System.out.println(list1.contains("mridha"));
        // System.out.println(list1.contains("mridhaaaa"));




        //index of element
        // System.out.println(list1);
        // System.out.println(list1.indexOf("mridha"));







        //nested lists
        // List<List<Integer>> nestedList = new ArrayList<>();
        
        //direct initialization

        // System.out.println(nestedList);
        // nestedList.add(new ArrayList<>(List.of(1,2,3)));
        // nestedList.add(new ArrayList<>(List.of(4,5,6)));
        // System.out.println(nestedList);

        //direct initialization 





        //STEP BY STEP INITIALIZATION

        // System.out.println(nestedList);

        // nestedList.add(new ArrayList<>());
        // nestedList.add(new ArrayList<>());
        // nestedList.add(new ArrayList<>());

        // System.out.println(nestedList);

        // List<Integer> innerList1 = nestedList.get(0);
        // innerList1.add(1);
        // innerList1.add(2);
        // innerList1.add(3);
        // List<Integer> innerList2 = nestedList.get(1);
        // innerList2.add(4);
        // innerList2.add(5);
        // innerList2.add(6);
        // System.out.println(nestedList);

        //STEP BY STEP INITIALIZATION





        //USING for LOOP TO PRINT THE nested list
        // nestedList.add(new ArrayList<>(List.of(1,2,3)));
        // nestedList.add(new ArrayList<>(List.of(4,5)));

        // System.out.println(nestedList);
        // for(int i = 0; i < nestedList.size(); i++){
        //     for(int j = 0; j < nestedList.get(i).size(); j++){
        //         System.out.print(nestedList.get(i).get(j) + " ");
        //     }
        //     System.out.println();
        // }



        //using foreach loop to priint the nested liist
        // nestedList.add(new ArrayList<>(List.of(1,2,3)));
        // nestedList.add(new ArrayList<>(List.of(4,5)));
        // System.out.println(nestedList);
        // for(List<Integer> innerlist : nestedList){
        //     for(int i : innerlist){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }


//IMPORTANT OPERATIONS   IMPORTANT OPERATIONS   IMPORTANT OPERATIONS   IMPORTANT OPERATIONS   IMPORTANT OPERATIONS   IMPORTANT OPERATIONS   IMPORTANT OPERATIONS   


        //sorting a liist
        // List<Integer> list7 = new ArrayList<>();
        // list7.add(4);
        // list7.add(3);
        // list7.add(2);
        // System.out.println(list7);
        // Collections.sort(list7);
        // System.out.println(list7);



          //remove from any index
        // System.out.println(list1);
        // list1.remove(0);
        // System.out.println(list1);
        // list1.remove(list1.size()-1);
        // System.out.println(list1);





             //addAll at index
        // Queue<String> q = new LinkedList<>();
        // q.add("123");
        // q.add("beautiful");
        // q.add("master");
        // System.out.println(list1);
        // list1.addAll(2, q);
        // System.out.println(list1);


        // //is empty?
        // System.out.println(list1.isEmpty());
        // list1.clear();
        // System.out.println(list1.isEmpty());





          //adding at the end of a list
        // System.out.println(list1);
        // list1.add("uff");
        // System.out.println(list1);
        
        
        
        
        
        //adding at an index
        // System.out.println(list1);
        // list1.add(2, "Wow");
        // System.out.println(list1);



        //get element
        // System.out.println(list1);
        // System.out.println("at 2nd index: "+list1.get(2));


        //set element. it replaces the previous value.
        // System.out.println(list1);
        // list1.set(1, "shutup");
        // System.out.println(list1);



        //contains all?
        // System.out.println(list1);
        //  List<String> list4 = new ArrayList<>();
        // list4.add("Amazing");
        // list4.add("uff");
        // list4.add("omg");
        // System.out.println(list1.containsAll(list1));
        // System.out.println(list1.containsAll(list4));


        //size of list
        // System.out.println(list1);
        // System.out.println(list1.size());



    }
    
}