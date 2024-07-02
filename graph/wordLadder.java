

https://leetcode.com/problems/word-ladder/description/
//BFS APPROACH IS BEST FOR FINDING SHORTEST PATH, SO THIS METHOD IS USED. FROM BEGINING WORD TO ENDING WORD, WE KEEP FINDING THE NEIGHBORS AND UPDATE CHANGES.
//IF THE END WORD IS FOUND ALONG THE PATH, WE RETURN THE COUNT.

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {


        //A HashSet to strore all the words and verify if the generated words are in the list or not
        Set<String> set = new HashSet<>(wordList);
        //if there is no endword, the ladder isnt possible.
        if(!set.contains(endWord)) return 0;
        

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        
        //its like a visit array for BFS
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        
        int changes = 1;
        
        //BFS approach. For example, for the word "be", its neighbors "ce" and "me" are found. After finding them, we do changes++.
        while(!queue.isEmpty()){
            int size = queue.size();
            //it ensures that all the elements are traversed at the current level. Like "ce" and "me" are the words at the second level of bfs traversal. at first, the neighbors of "ce" are 
            //determined. then the neighbors of "me" are determined. Note that the size variable is updated after every level, size isnt same all the time.
            for(int i = 0; i < size; i++){
                String word = queue.poll();
                //if the pulled word is the end word, return changes;
                if(word.equals(endWord)) return changes;
                
                //find all possible combinations of the given word
                for(int j = 0; j < word.length(); j++){
                    for(int k = 'a'; k <= 'z'; k++){
                        char arr[] = word.toCharArray();
                        arr[j] = (char) k;
                        
                        String str = new String(arr);
                        //if the word exists in the HashSet, and if the word is unvisited, we add the word to the queue.
                        if(set.contains(str) && !visited.contains(str)){
                            queue.add(str);
                            visited.add(str);
                        }
                    }
                }
            }
            //we update changes after the loop because we go from one word to another after the whole level (FA---->>>ce and me ) is traversed.
            //for example----> be takes 1 step to go to ce and me. and ce takes one step to go from ce to co. similarly, me takes one step to go from me to mo.
            //a reference queue---->>   be|      ce|me|     co|mo|     ko . just for calcualtion, actual dry run differs.
            //so, total steps is be---ce----co---ko which is 4. so the answer is 4. this answer is returned in the upper code.
            ++changes;
        }
        //if the steps is not returned, return 0, meaning its not possible;
        return 0;
    }
}