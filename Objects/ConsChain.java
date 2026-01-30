class ConsChain {
    int x;
    public ConsChain(){
        System.out.println("Hi");
    }

    public ConsChain(int x) {
        this();
        this.x = x;
        System.out.println("Bye");
    }
    public static void main(String[] args) {
        ConsChain a= new ConsChain(10);
        a.x=12;
        System.out.println(a.x);
    }
    
}