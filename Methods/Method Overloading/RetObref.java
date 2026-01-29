class RetObref {
    public static void main(String[] args) {
        RetObref d=new RetObref();
        System.out.println(Method(d));
    }
    public static RetObref Method(RetObref a)
    {
        return a;
    }
}