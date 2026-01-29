class Obref {
     public static void main(String[] args) {
        Obref a=new Obref();
        Method.Obref(a);

    }
}

class Method{
    public static void Obref(Obref a){
        System.out.println(a);
    }
}