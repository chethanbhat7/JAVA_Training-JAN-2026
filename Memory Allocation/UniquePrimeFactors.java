class UniquePrimeFactors {
    public static void PrintPrime(int num)
    {
    while(num!=1)
    {
        System.out.println(num);
        for (int i = 2; i < num; i++) 
        {
            System.out.println(i);
            if(num%i==0)
            {
            System.out.println(i);
            num/=i;
            break;
            }
        }
    }
}
    public static void main(String[] args) {
        PrintPrime(666);
    }
}