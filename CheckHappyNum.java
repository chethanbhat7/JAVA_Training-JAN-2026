import java.util.HashSet;
import java.util.Set;
class CheckHappyNum {
     public static void main()
    {
        int a=100;
        Set<Integer> usedInteger=new HashSet<>();
        while(true)
        {
            int sum=0;
            while(a!=0)
            {
                sum+=Math.pow(a%10,2.0);
                a/=10;
            }
        if(sum==1){
            System.out.println("Happy Number");
        }
        a=sum;
        if(usedInteger.contains(a))
        {
        System.out.println("Not Happy Number");    
        }
        usedInteger.add(a);
        }
    }
}