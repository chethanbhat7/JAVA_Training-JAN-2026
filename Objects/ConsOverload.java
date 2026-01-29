class ConsOverload {
    String Studname;
    int Studage;
    String Studdept;

    String  Facname;
    int Facage;
    long Facsal;
    String Facdept;

    public ConsOverload(String Studname,int Studage,String Studdept){
        this.Studname=Studname;
        this.Studage=Studage;
        this.Studdept=Studdept;
    }
    public ConsOverload(String Facname,int  Facage,String Facdept,long Facsal){
        this.Facname=Facname;
        this.Facage=Facage;
        this.Facdept=Facdept;
        this.Facsal=Facsal;
    }

    public void FOPrint(){
        System.out.println("Faculty Name:"+Facname+"\nFaculty age: "+Facage+"\nFaculty Department:"+Facdept+"\nFaculty Salary "+Facsal+"\n\n");
    }

    public void SOPrint(){
        System.out.println("Student Name:"+Studname+"\nStudent age: "+Studage+"\nStudent Department:"+Studdept+"\n\n");
    }


    public static void main(String[] args) {
        ConsOverload Chethan= new ConsOverload("Chethan",20,"AIML");
        ConsOverload Abhishek= new ConsOverload("Abhishek",25,"AIML",30000);

        Chethan.SOPrint();
        Abhishek.FOPrint();

    }
}