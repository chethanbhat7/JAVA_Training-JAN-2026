class gfinfo{
	public static void main(String[] args){
		String Name="Chethan";
		int Age =21;
		long Phone =90808219990L;
		float Salary =0.5f;
		String Address="VCET,Puttur";
		
		Print_Gf_Info(Name,Age,Phone,Salary,Address);
	}
	static void Print_Gf_Info(String Name,int Age,long Phone,float Salary,String Address){
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Name:"+Name+" Age:"+Age+" Phone:"+Phone+" Salary:"+Salary+" Address:"+Address);
	}
}
