class Examples {
    public static void main(String[] args) {
        String FirstString=new String("HI");
        String SecondString="HI";
        System.out.println(FirstString.equals(SecondString));
        System.out.println(FirstString==SecondString);

        String EachChar="abcdefghijklmnopqrstuvwxyz";

        for(int i=0;i<=EachChar.length()-1;i++)
        {
            System.out.println(EachChar.charAt(i));
        }

    }
}