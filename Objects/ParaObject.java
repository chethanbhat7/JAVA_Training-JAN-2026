class ParaObject {
    String Name;
    int Age;
    String Gender;
    public ParaObject(String Name,int Age,String Gender){
        this.Name=Name;
        this.Age=Age;
        this.Gender=Gender;
    }


    public static void main(String[] args) {
        ParaObject a =new ParaObject("Chethan",20,"Male");

        System.out.println(a.Name+"\t"+a.Age+"\t"+a.Gender);
    }
}