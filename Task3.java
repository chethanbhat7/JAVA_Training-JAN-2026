class Task3{
	public static void main(String[] args){
		int arr[]={'D','I','S','C','I','P','L','I','N','E'};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=(arr[i]-64);
		}
		System.out.println(sum);
	}
}
