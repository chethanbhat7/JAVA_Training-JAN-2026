class CheckLuckyDate {
     public static int getSingle(int num)
        {   
            if(num<9)
            {
                return num;
            }
            int sum=0;
            while(num!=0)
            {
                sum+=(num%10);
                num/=10;
            }
            return getSingle(num);
        }
    public static void main(String[] args) {
        int num=9112005;
        int year=num%10000;
        num/=10000;
        int month=num%100;
        num/=100;
        int date=num;

        System.out.println(getSingle(date)==getSingle(getSingle(date)+getSingle(month)+getSingle(year)));
       
    }
}