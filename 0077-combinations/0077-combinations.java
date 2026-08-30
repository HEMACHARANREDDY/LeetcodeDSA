class Solution {

   private List<List<Integer>> ans= new ArrayList<>();

    public void helper(int start, int end, int n, int k, List<Integer> list)
    {
        if(list.size()==k )
        {
             ans.add(new ArrayList(list));
             return;
        }

        if(start>n)
        {
            return;
        }

        for(int i=start; i<=n; i++)
        {
            list.add(i);
            helper(i+1,end, n,k, list);
            list.remove(list.size()-1);
        }
 
    }
    public List<List<Integer>> combine(int n, int k) {
        
        
        int start=1;
        int end=n;

        helper(start,end, n,k, new ArrayList<Integer>());

        return ans;
    }
}