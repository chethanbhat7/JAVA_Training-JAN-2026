class MyInt {
    public static void main(String[] args) {
        NewInt a=new NewInt(10);
        System.out.println(a);

        NewLong b=new NewLong(900000000);
        System.out.println(b);
    }
}

class NewInt
{
    int data=10;

    public NewInt(int data) {
        this.data=data;
    }

    @Override
    public String toString() {
        return ""+data;
    }

    
    
}

class NewLong{
    long data;
    public NewLong(long data) {
        this.data=data;
    }

    @Override
    public String toString() {
        return ""+data;
    }

    
    
}