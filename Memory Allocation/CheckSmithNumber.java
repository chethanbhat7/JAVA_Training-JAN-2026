class checkSmithNumber {
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
    public static int getPrimesum(int num)
    {
        int sum=0;
        for (int i = 2; i <= num; i++) 
        {
            while(num%i==0)
            {        
                if(i>9)
                {
                    sum+=getSingle(i);
                }
                else
                    sum+=i;
                num/=i;
            }
        }
        return sum;
    }

    public static String checkSmith(int num)
    {
        return getSingle(num)==getPrimesum(num)? "Smith" : "Not Smith";
    }

    public static void main(String[] args) {
        System.out.println(checkSmith(666));
    }
}