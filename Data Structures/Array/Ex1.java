class Ex1 {
    public static void main(String[] args) {

        int arr[] ={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
        arr[9]=0;
        System.out.println(arr[9]);
    }
}