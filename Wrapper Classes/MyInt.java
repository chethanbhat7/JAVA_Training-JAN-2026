class MyInt {
    public static void main(String[] args) {
        NewInt a=new NewInt(10);
        System.out.println(a);
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