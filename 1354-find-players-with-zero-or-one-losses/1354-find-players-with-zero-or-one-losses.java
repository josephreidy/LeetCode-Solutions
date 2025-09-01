class Solution {
    public List<List<Integer>> findWinners(int[][] matches) 
    {
        HashSet<Integer> players = new HashSet<Integer>();
        HashMap<Integer, Integer> playerToLossNo = new HashMap<Integer, Integer>();
        List<Integer> noLossPlayers = new ArrayList<Integer>();
        List<Integer> oneLossPlayers = new ArrayList<Integer>();
        
        for(int[] match : matches)
        {
            players.add(match[0]);
            players.add(match[1]);
            playerToLossNo.put(match[1], playerToLossNo.getOrDefault(match[1], 0) + 1);
        }
        
        for(int i : players)
        {
            if(playerToLossNo.getOrDefault(i,0) == 0)
            {
                noLossPlayers.add(i);
            }
            else if(playerToLossNo.getOrDefault(i,-1) == 1)
            {
                oneLossPlayers.add(i);
            }
        }
        List<List<Integer>> returnList = new ArrayList<List<Integer>>();
        Collections.sort(noLossPlayers);
        Collections.sort(oneLossPlayers);
        returnList.add(noLossPlayers);
        returnList.add(oneLossPlayers);
        return returnList;
    }
}