import java.util.Scanner;
public class Q1 {
  int[] price;
  int[] cost;
  Scanner scan;
  public static void main(String[] args) {
    new Q1();
  }
  
  private Q1() {
    scan = new Scanner(System.in);
    System.out.println("enter the number of station you want to travel");
    int n = scan.nextInt();
    System.out.println("enter the random size of price table");
    int m = scan.nextInt();
    setprice(m);
    costs(price,n);
    for(int i=0;i<price.length;i++)
    {System.out.print(price[i]+" ");}
    System.out.println();
    System.out.println("minimum cost for "+n+" is "+cost[n - 1]);
  }
  private void setprice(int m) {
    price = new int[m];
    for (int i=0; i<m;i++) {
      price[i]=(int)(5*(Math.random()+1)-6);
    }
  }
  private void costs(int[] p, int n) {
    int temp;
    cost = new int[n];
    cost[0] = p[0];
    for (int i=1; i<n; i++) {
      if (i<p.length)
      {cost[i] = p[i];}
      for (int j=0;j<i/2+1;j++) {
        cost[i] = Math.min(cost[j]+cost[i-j-1],cost[i]);
      }
    }
  }
}