class PersonInfo{
	public static void main(String[] args){
		String Name="John";
		int Age =21;
		long Phone =9999999999L;
		float Salary =50000f;
		String Address="Unknown";
		
		printPersonInfo(Name,Age,Phone,Salary,Address);
	}
	static void printPersonInfo(String Name,int Age,long Phone,float Salary,String Address){
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Name:"+Name+" Age:"+Age+" Phone:"+Phone+" Salary:"+Salary+" Address:"+Address);
	}
}
