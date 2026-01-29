class Compound_Increment {
    public static void main(String[] args) {
        int cominc=0;
        int comdec=5;
        int commul=1;
        int comdiv=100;
        for(int i=1;i<5;i++)
        {   
            System.out.println("Iteration: "+i);
            System.out.println("Compound increment += "+(cominc+=i));
            System.out.println("Compound decrement += "+(comdec-=i));
            System.out.println("Compound multiply += "+(commul*=i));
            //System.out.println("Compound division += "+(i/=cominc));
            System.out.println("----------------------------------------------------------");
        }
    }
}