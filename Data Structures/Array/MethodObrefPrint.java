class MethodObrefPrint {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        getObref().Pprint(arr);
    }
    public static MethodObrefPrint getObref()
    {
        MethodObrefPrint a=new MethodObrefPrint();
        return a;
    }
    public void Pprint(int arr[])
    {
        for(Integer i:arr){
            System.out.println(i);
        }
    }
}
