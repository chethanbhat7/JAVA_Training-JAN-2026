class Sum {
    public static void sum(int a,int b){
        System.out.println(a+b);
    }
    public static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
     public static void sum(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }
}

class Ex1{
    public static void main(String[] args) {
        Sum.sum(10,20);
        Sum.sum(10,20,30);
        Sum.sum(10,20,30,40);
    }
}