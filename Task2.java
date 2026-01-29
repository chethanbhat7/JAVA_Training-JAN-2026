class Task2 {
    public static Task2 RetObject(){
        return new Task2();
    }

    public int[] OddPrime(int arr[]){
        int count=0;
        for (int idx = 0; idx < arr.length; idx++) 
        {
            int checkPrime=arr[idx];
            for (int i = 2; i < arr.length; i++) 
            {
                if(i%checkPrime==0)
                {
                    break;
                }
            }
            if(checkPrime%2!=0)
            {
                count++;
            }   
        }
        int retarr[]=new int[count];
        int x=0;
        for (int idx = 0; idx < arr.length; idx++) 
        {
            int checkPrime=arr[idx];
            for (int i = 2; i < arr.length; i++) 
            {
                if(i%checkPrime==0)
                {
                    break;
                }
            }
            if(checkPrime%2!=0)
            {
                retarr[x]=checkPrime;
                x++;
            }   
        }
        
        return retarr;
    }
    public static void main(){
        int arr[]={1,2,3,5,7,11,13,17};    
        int retarr[]=RetObject().OddPrime(arr);
        for (int idx = 0; idx < retarr.length; idx++) {
            System.out.println(retarr[idx]);       
        }
    }
}