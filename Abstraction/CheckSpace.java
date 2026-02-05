class CheckSpace {
    public static int CheckSpace(String s)
    {
        int count=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==' ')
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s="A B C";
        System.out.println(CheckSpace(s));
    }
}