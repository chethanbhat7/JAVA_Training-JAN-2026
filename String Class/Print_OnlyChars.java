class Print_OnlyChars {
    public static void PrintOnlyChar(String s)
    {
        int countofchars=0;

        for (int i = 0; i < s.length(); i++) 
        {
            int c=s.charAt(i);
            if((c>=65 && c<=90) || (c>=97 && c<=122))
            {
                countofchars++;
            }    
        }
        int j=0;
        int k=0;
        boolean gotchar=false;
        while(k<countofchars && j<s.length())
        {   
            int c=s.charAt(j);
            if(c==32 && !gotchar)
            {
                j++;
            }
            else if((c>=65 && c<=90) || (c>=97 && c<=122))
            {
                gotchar=true;
                System.out.print(s.charAt(j));
                j++;
                k++;
            }
            else
            {
                System.out.print(s.charAt(j));
                j++;
            }
        }

    }
    public static void main(String[] args) {
        String s="         A B C D E F              ";
        PrintOnlyChar(s);
    }
}