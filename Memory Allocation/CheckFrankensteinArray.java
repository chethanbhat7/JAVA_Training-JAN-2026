class CheckFrankensteinArray {
    public static String Check(int num)
    {   
        int arrofnums[]=new int[3];
        arrofnums[0]=num;
        arrofnums[1]=num*2;
        arrofnums[2]=num*3;

        int arr[]=new int[10];

        for(Integer ele:arrofnums)
        {
        while(ele!=0)
        {
            int digit=ele%10;
            arr[digit]++;
            ele/=10;
        }
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