class CheckLuckyDate {
     public static int getSingle(int num)
        {   
            if(num<10)
            {
                return num;
            }
            int sum=0;
            while(num!=0)
            {
                sum+=(num%10);
                num/=10;
            }
            return getSingle(sum);
        }

        public static boolean CheckLucky(int num)
        {
        
        int year=num%10000;
        num/=10000;
        int month=num%100;
        num/=100;
        int date=num;
        boolean value=getSingle(date)==getSingle(getSingle(date)+getSingle(month)+getSingle(year));

        return(value);

        }
    public static void main(String[] args) {
            int num=9112005;
            boolean isLucky=CheckLucky(num);

            if(isLucky)
            {
                System.out.println("Lucky Person");
            }
            else System.out.println("Not Lucky");
        
    }
}