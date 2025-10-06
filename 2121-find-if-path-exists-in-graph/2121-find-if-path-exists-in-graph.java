class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) 
    {
        //HashMap<Integer, ArrayList<Integer>> graph = new HashMap();
        ArrayList<ArrayList<Integer>> graph = new ArrayList();

        for(int i = 0; i < n; i++)
        {
            ArrayList<Integer> list = new ArrayList<Integer>();
            graph.add(list);
        }
        for(int[] edge : edges)
        {
            int x = edge[0];
            int y = edge[1];
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        boolean[] seen = new boolean[n];
        //System.out.println("std out works");
        return dfs(source, destination, seen, graph);

    }

    boolean dfs(int node, int dest, boolean[] seen, ArrayList<ArrayList<Integer>> graph)
    {
        if(node == dest)
        {
            //System.out.println(node);
            return true;
        }
        seen[node] = true;
        ArrayList<Integer> adjacent = graph.get(node);
        for(int value : adjacent)
        {
            boolean foundDest = false;
            if(seen[value] == false)
            {
                foundDest = foundDest || dfs(value, dest, seen, graph);
                if (foundDest == true) return true;
            }
        }
        return false;
    }
}