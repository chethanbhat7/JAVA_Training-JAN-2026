import java.util.Scanner;

class NestedLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mat[][]=new int[n][m];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix Elements are");
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}