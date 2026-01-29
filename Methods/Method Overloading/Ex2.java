class Ex2 {
    public static void main(String[] args) {
        Print.Print(10);
        System.out.println(10);
         Print.Print(10.0);
        System.out.println(10.0);
         Print.Print('A');
        System.out.println('A');
    }
    
}

class Print{
    public static void Print(int a){
        System.out.println(a);
    }
    public static void Print(float a){
        System.out.println(a);
    }
    public static void Print(char a){
        System.out.println(a);
    }
    public static void Print(double a){
        System.out.println(a);
    }
}