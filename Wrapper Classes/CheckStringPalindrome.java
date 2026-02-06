class CheckStringPalindrome {
    static String checkpali(String s)
    {
        String revds="";
        for(int i=s.length()-1;i>=0;i--)
        {
            revds+=s.charAt(i);
        }
        if(revds.equals(s))
        {
            return "true";
        }
        else
        return "false";
    }
    public static void main(String[] args) {
        System.out.println(checkpali("BOB"));
        System.out.println(checkpali("Chethan"));
    }
}