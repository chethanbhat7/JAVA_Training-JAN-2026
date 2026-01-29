class MethodRetArray {
    public static int[] RetArray(int[] arr){
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int returnedarray[]=(RetArray(arr));
        for (Integer x : returnedarray) {
            System.out.println(x);
            
        }
    }
}