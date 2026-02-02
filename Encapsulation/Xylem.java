class Xylem {
    public static String CheckXylem(int num)
    {
        int last=num%10;
        num/=10;
        int sum=0;
        while(num>=10)
        {
            sum+=num%10;
            num/=10;
        }
        if(num*last==sum)
        {
            return "true";
        }
        else 
        return "false";
    }
    public static void main(String[] args) {
        System.out.println(CheckXylem(1224));
    }
}