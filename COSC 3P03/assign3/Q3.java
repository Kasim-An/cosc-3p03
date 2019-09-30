import java.util.Scanner;

public class Q3 {
  public static Scanner s;
  public static int n;
  public static  int[] r;
  public static  int[][] M;
  public static void main(String[] args) {
    s = new Scanner(System.in);
    System.out.println("enter the numbers of matrix to multiply");
    n = s.nextInt();
    r = new int[n + 1];
    for (int i=0;i<n+1;i++) {
      System.out.println("enter r"+i+" to set the size of matrix");
      r[i] = s.nextInt();
    }
    optimal();
    for (int x=1;x<n+1;x++) {
      for (int y=1; y<n+1;y++) {
        System.out.print(M[x][y]+" ");
      }
      System.out.println();
    }
  }
  private static void optimal() {
    int j;
    M = new int[n+1][n+1];
    for (int k=2;k<=n;k++) {
      for (int i=1;i<=n-k+1;i++) {
        j=i+k-1;
        cal(i,j);
      }
    }
  }
  private static void cal(int x, int y) {
    int temp;
    M[x][y]=Integer.MAX_VALUE;
    for (int i=0; i<y-x; i++) {
      temp = M[x][x+i]+M[x+i+1][y]+r[x-1]*r[x+i]*r[y];
      if (M[x][y]>temp) 
      {
        M[x][y]=temp;
      }
    }
  }
}