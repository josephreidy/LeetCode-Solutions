class Solution {
    public String simplifyPath(String path) 
    {
        ArrayList<String> commands = new ArrayList();

        int i = 0;
        while(i < path.length())
        {
            StringBuilder thisString = new StringBuilder();
            while (i < path.length() && path.charAt(i) != '/')
            {
                thisString.append(path.charAt(i));
                i++;
            }
            if (thisString.length() > 0)
            {
                //commands.add("/");
                commands.add(thisString.toString());
            }
            i++;
        }

        Stack<String> stack = new Stack();

        for (String s : commands)
        {
            if(s.equals("."))
            {

            }
            else if(s.equals(".."))
            {
                if(stack.size() > 0)
                {
                    stack.pop();
                }
            }
            else
            {
                stack.push(s);
            }
        }
        StringBuilder returnString = new StringBuilder();

        for(String s : stack)
        {
            returnString.append(s);
            returnString.append("/");
        }
        if (returnString.length() > 0)
        {
            returnString.deleteCharAt(returnString.length()-1);
        }
        returnString.insert(0, '/');

        return returnString.toString();
    }
}