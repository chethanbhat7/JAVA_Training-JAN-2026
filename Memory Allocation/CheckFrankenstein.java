class CheckFrankenstein {
    public static String Check(int num)
    {
        int num2=num*2;
        int num3=num*3;

        int arr[]=new int[10];

        while(num!=0)
        {
            int digit=num%10;
            arr[digit]++;
            num/=10;
        }

        while(num2!=0)
        {
            int digit=num2%10;
            arr[digit]++;
            num2/=10;
        }

        while(num3!=0)
        {
            int digit=num3%10;
            arr[digit]++;
            num3/=10;
        }

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                return "Not Frankistein";
            }
        }
        return "Frankestien Number";

    }

    public static void main(String[] args) {
        System.out.println(Check(192));
    }
}