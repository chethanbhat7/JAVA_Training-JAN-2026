class checkAnagram {
    static boolean checkAna(String s1,String s2)
    {
        int count=0;
        if(s1.length()!=s2.length())
        {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if(s1.charAt(i)==s2.charAt(j))
                {
                    count++;
                    break;
                }
            }
        }
        if(count==s1.length())
        {
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(checkAna("listen","silent"));
    }
}