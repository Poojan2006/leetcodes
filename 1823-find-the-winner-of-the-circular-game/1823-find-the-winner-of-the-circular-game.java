class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=n;i++)
        {
            queue.add(i);
        }
        while(queue.size()>1)
        {
            for(int i=1;i<k;i++)
            {
                int x = queue.remove();
                queue.add(x);
            }
            queue.remove();

        }
       return queue.peek(); 
    }
}