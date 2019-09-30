import java.util.*;
public class Q2{
  public static void main(String[] args){
    String a,b;
    Scanner s=new Scanner(System.in);
    System.out.println("enter first string");
    a=s.next();
    System.out.println("enter second string");
    b=s.next();
    int result=substring(a,b);
    System.out.println("the longest common substring length is "+result);
  }
  public static int substring(String a, String b){
    int m = a.length();
    int n = b.length();
    int max = 0;
    int[][] help = new int[m][n];
    for(int i=0; i<m; i++){
      for(int j=0; j<n; j++){
        if(a.charAt(i) == b.charAt(j)){
          if(i==0&&j==0)
          {
            help[i][j]=1;
          }
          else
          {
            help[i][j] = help[i-1][j-1]+1;
          }
          if(max < help[i][j])
            max = help[i][j];
        }
      }
    }
    return max;
  }
}