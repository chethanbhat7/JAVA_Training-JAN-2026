class PrintChar {

    public static void Print(String s)
    {
        int start=0;
        int end=s.length()-1;

        while (start<s.length()-1) {
            if(s.charAt(start)==32)
            {
                start++;
            }
            else 
            break; 
        }

        while (end>0) {
            if((int)s.charAt(end)==32)
            {
                end--;
            }
            else 
            break; 
        }

        for(int i=start;i<=end;i++)
        {
            System.out.print(s.charAt(i));
        }

    }

    public static void main(String[] args) {
        String s="   A BC        ";
        Print(s);
    }   
}