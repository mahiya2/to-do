import java.util.*;
public class Day3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a<b)&&(a<c)){
            System.out.println("a is smaller");
        }
        else if((b<a)&&(b<c)){
            System.out.println("b is smaller");
        }
        else if((c<a)&&(c<b)){
            System.out.println("c is smaller");
        }
    }
}