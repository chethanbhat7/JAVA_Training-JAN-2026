class PrintAscii{
    public static void main(String[] args) {
        for(int i=48;i<=122;i++)
        {
            if((i>=48 && i<=57) || (i>=65 && i<=90) || (i>=97 && i<=122))
            System.out.println("Character:"+(char)i+"\tAscii:"+i);
        }
    }
}