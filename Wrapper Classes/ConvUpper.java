class ConvUpper {

    static String ToCaps(String s)
    {
        String newS="";
        for (int i = 0; i < s.length(); i++) {
            int now=s.charAt(i);
            if(now>=97 && now<=122)
            {
                newS+=(char)(now-32);
            }
            else
            newS+=(char)now;
        }
        return newS;
    }
    public static void main(String[] args) {
        System.out.println(ToCaps("chethan"));
    }
}