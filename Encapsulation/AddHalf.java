class AddHalf {
    public static String check(int num)
    {
        int forcountinputnum=num;
        int countdigitsinput=0;
        int squared=num*num;
        int countdigitssquared=0;
        int forcountsquarednums=squared;
        while(forcountsquarednums!=0)
        {
            countdigitssquared++;
            forcountsquarednums/=10;
        }
        while(forcountinputnum!=0)
        {
            countdigitsinput++;
            forcountinputnum/=10;
        }
        if (countdigitssquared %2==0)
        {
            int half=1;
            for (int i = 0; i < countdigitssquared/2; i++) {
                half*=10;
            }
            int firsthalf=squared/half;
            int secondhalf=squared%half;
            if(firsthalf+secondhalf==num)
            {
                return "true";
            }
            else return "false";

        }
        else
        {
            int half=1;
            for (int i = 0; i < countdigitsinput; i++) {
                half*=10;
            }
            int firsthalf=squared/half;
            int secondhalf=squared%half;
            if(firsthalf+secondhalf==num)
            {
                return "true";
            }
            else return "false";

        }
    }
    public static void main(String[] args) {
        System.out.println(check(450));
    }
}