class Boolean_Operators {
    public static void main(String[] args) {
        char Size='S';
        String Colour="Blue";
        Boolean Blue=true;
        if(Colour=="Blue" && Size=='S'){
            System.err.println("Tshirt of Blue colour and Size S is available");
        }
        if(Colour=="Blue" || Size=='M'){
            System.out.println("Tshirt of Blue colour or Size M is available");
        }
        if(!(Colour=="Red")){
            System.err.println("Red Colour is Not Available");
        }
        System.out.println("\n\n");

        System.out.println(!Blue == true);

        
    }
}