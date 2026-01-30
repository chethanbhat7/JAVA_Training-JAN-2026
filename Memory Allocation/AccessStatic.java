class AccessStatic {
        static int Salary=10000;
        String Name;
        int age;
        String Contact;

        public AccessStatic(String Name,int age,String Contact){
            this.Name=Name;
            this.age=age;
            this.Contact=Contact;
        }

        public int ValueofSalary()
        {
            return(Salary);
        }

        public void PrintRecord()
        {
            System.out.println("Name:"+Name+"\nAge"+age+"\nContact:"+Contact+"\nSalary:"+ValueofSalary());
        }
    public static void main(String[] args) {
        AccessStatic Ramu=new AccessStatic("Ramu",64,"8073468867");
        Ramu.PrintRecord();
        
    }
}