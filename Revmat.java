import java.util.*;
public class Revmat{
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }
    System.out.println("After reversing");
    for(int i=0;i<r;i++)
    {
      for(int j=c-1;j>-1;j--)
      {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    }
  }

