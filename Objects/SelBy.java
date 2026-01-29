class SelBy {
    int Selid;
    String Selname;
    String Seladd;
    long Selnum;
    int Selage;
    int Selexp;
    String Selgen;

    int Buyid;
    String Buyname;
    String Buyadd;
    long Buynum;
    int Buyage;
    int Buyexp;
    String Buygen;

    public SelBy(int Selid,String Selname,String Seladd,long Selnum,int Selage,int Selexp,String Selgen)
    {
        this.Selid=Selid;
        this.Selname=Selname;
        this.Seladd=Seladd;
        this.Selnum=Selnum;
        this.Selage=Selage;
        this.Selexp=Selexp;
        this.Selgen=Selgen;
    }

    public SelBy(String Buyname,int Buyid,String Buyadd,long Buynum,int Buyage,int Buyexp,String Buygen)
    {
        this.Buyid=Buyid;
        this.Buyname=Buyname;
        this.Buyadd=Buyadd;
        this.Buynum=Buynum;
        this.Buyage=Buyage;
        this.Buyexp=Buyexp;
        this.Buygen=Buygen;
    }
    

    public void SOPrint(){
        System.out.println("Seller ID:"+Selid+"\nSeller Name:"+Selname+"\nSeller age: "+Selage+"\nSeller Address:"+Seladd+"\nSeller Number:"+Selnum+"\nSeller Gender:"+Selgen+"\nSeller Address:"+Seladd+"\nSeller Experience:"+Selexp+"\n\n");
    }

    public void BOPrint(){
        System.out.println("Buyer ID:"+Buyid+"\nBuyer Name:"+Buyname+"\nBuyer age: "+Buyage+"\nBuyer Address:"+Buyadd+"\nBuyer Number:"+Buynum+"\nBuyer Gender:"+Buygen+"\nBuyer Address:"+Buyadd+"\nBuyer Experience:"+Buyexp+"\n\n");
    }


    public static void main (String[] args){
        SelBy SellerAshith=new SelBy(101,"Ashith","VCET",9090999,20,10,"Male");
        SellerAshith.SOPrint();

        SelBy BuyerChirag=new SelBy("Chirag",420,"TECV",1010111,21,11,"Male");
        BuyerChirag.BOPrint();

    }





}