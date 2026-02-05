class Trim {

    static String trim(String s)
    {
        int start=0;
        int end=s.length()-1;

        while(start<s.length())
        {
            if(s.charAt(start)!=' ')
            {
                break;
            }
            start++;
        }
        while(end>=0)
        {
            if(s.charAt(end)!=' ')
            {
                break;
            }
            end--;
        }
        String newString="";
        for(int i=start;i<=end;i++)
        {
            newString+=s.charAt(i);
        }
        return newString;
    }
    public static void main(String[] args) {
        String s = "         A B              C";
        System.out.println(trim(s));
    }
}