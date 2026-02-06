import java.util.Arrays;
class Example {
    public static void main(String[] args) {
        Integer i = 10;
        int hashcode = System.identityHashCode(i);
        System.out.println(Integer.toHexString(hashcode));
        System.out.println(i);

        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
    }
}
