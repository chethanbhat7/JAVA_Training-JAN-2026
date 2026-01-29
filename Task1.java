class Task1 {
    public static Task1 RetObject(){
        return new Task1();
    }

    public void printAlpha(){
        System.out.println("Alphabet\tindex");
        for (int i = 65; i <=90; i++) {
            System.out.println((char)i+"\t\t"+(i-64));
        }
    }
    public static void main(){
            RetObject().printAlpha();
    }
}