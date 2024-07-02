
 //Definition for a Node. A node has its value(int) and an arraylist of its neighbors. like node 0 has value- 0    and    its neighbors  |1|4| in the arraylist. A graph is made 
 //continually adding nodes or neighbors like this. for the problem use this graph----    0------1
 //                                                                                       |      |
 //                                                                                       4------3
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}


class Solution {

    // the hashmap makes a table for the newnodes and its values created. Because of it, if the creation of a node is called recursively, the node of the hashmap will be 
    // dragged out. 
    public HashMap<Integer, Node> map = new HashMap<>();
    

    //main function returning the main node of a graph
    public Node cloneGraph(Node node) {
        return clone(node);
    }
    


    public Node clone(Node node) {
        if (node == null) return null;
        
        if (map.containsKey(node.val)) 
            return map.get(node.val);


        //A newNode is created with empty neighbors
        Node newNode = new Node(node.val, new ArrayList<Node>());
        //the newnode is put into the hm for further use
        map.put(newNode.val, newNode);

        //iterating thru the neighbors of the node of the given graph, we make and add neighbors to our cloned graph recursively.
        for (Node neighbor : node.neighbors) 
            newNode.neighbors.add(clone(neighbor));
            
        //returning the newNode is important because the second last node has the last node as its neighbor, similarly, 1st node has 2nd node as its neighbor and so on.
        return newNode;
    }
}