class Solution {
    public int findCircleNum(int[][] isConnected) 
    {
        // initialise graph as hash map
        HashMap<Integer, ArrayList<Integer>> graph = new HashMap();
        for(int i = 0; i < isConnected.length; i++)
        {
            ArrayList<Integer> list = new ArrayList();
            
            for(int j = 0; j < isConnected.length; j++)
            {
                if(isConnected[i][j] == 1 && j != i)
                {
                    list.add(j);
                }
            }
            graph.put(i, list);
        }

        int provinces = 0;
        HashSet<Integer> seen = new HashSet();
        for(int i = 0; i < graph.size(); i++)
        {
            if(!seen.contains(i))
            {
                provinces++;
                dfs(i, graph, seen);
            }
        }
        return provinces;
    }

    void dfs(int node, HashMap<Integer, ArrayList<Integer>> graph, HashSet<Integer> seen)
    {
        seen.add(node);
        ArrayList<Integer> list = graph.get(node);
        for(int point : list)
        {
            if(!seen.contains(point))
            {
                dfs(point, graph, seen);
            }
        }
    }
}