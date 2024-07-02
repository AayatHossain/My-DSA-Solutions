import java.util.ArrayList;
import java.util.List;

public class roomsAndKeysLeetcode {
    static List<Integer> gobalList = new ArrayList<>();
    public static boolean room(List<List<Integer>> rooms){
            for(int i = 0; i < rooms.size(); i++){
            List<Integer> subList = rooms.get(i);
            for(int j = 0; j <subList.size(); j++){
                gobalList.add(subList.get(j));
            }
            for(int i = 0; i < rooms.size(); i++){
                for(int j = 0; j < gobalList.size(); j++){
                    if(i==gobalList.get(j)){
                        break;
                    } else if (j==gobalList.size()-1 && i != gobalList.get(j)) {
                        return false;
                    }
                }
            }
            return true;
    }
    public static void main(String args[]){
        List<List<Integer>> rooms = new ArrayList<>();
       

    }
}
