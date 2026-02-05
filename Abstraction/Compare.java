import java.util.Arrays;

class Compare {
    public static void main(String[] args) {
        
    
    AshithGF arr[]={new AshithGF("Ashitha",21,10000),new AshithGF("Mashitha",20,20000)};

    Arrays.sort(arr);
        for (AshithGF person : arr) {
            System.out.println(person);
        }
    }
}
