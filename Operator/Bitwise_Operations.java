class Bitwise_Operations {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        System.err.println("a:"+Integer.toBinaryString(a));
        System.err.println("b:"+Integer.toBinaryString(b));
        System.out.println("a&b:"+Integer.toBinaryString(a&b));
        System.out.println("a|b:"+Integer.toBinaryString(a|b));
        System.out.println("a^b:"+Integer.toBinaryString(a^b));
        System.out.println("~a:"+(~(-37)));
        System.out.println("a>>2:"+Integer.toBinaryString(a>>2));
        System.out.println("a<<2:"+Integer.toBinaryString(a<<2));

    }
}