
class Solution
{
    
    public class Interval{
        int start;
        int end;
        public Interval(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    
    public int[][] overlappedInterval(int[][] a)
    {
        Arrays.sort(a, Comparator.comparingInt(arr -> arr[0]));
        Stack<Interval> s = new Stack<>();
        s.push(new Interval(a[0][0], a[0][1]));
        for(int i = 1; i < a.length; i++){
            Interval initial = s.peek();
            int finalStart = a[i][0];
            int finalEnd = a[i][1];
            if(initial.end >= finalStart){
                if(initial.end > finalEnd){
                    s.pop();
                    s.push(new Interval(initial.start, initial.end));
                }else{
                    s.pop();
                    s.push(new Interval(initial.start, finalEnd));
                }
            }else{
                s.push(new Interval(a[i][0], a[i][1]));
            }
        }
        int ans[][] = new int[s.size()][2];
        for(int i = 0; i < ans.length; i++){
            Interval inter = s.pop();
            ans[i][0] = inter.start;
            ans[i][1] = inter.end;
        }
        Arrays.sort(ans, Comparator.comparingInt(answer -> answer[0]));
        return ans;
    }
}