import java.util.Scanner;
public class Integer_to_binary{
    public static String Convert_Binary(int n){
       StringBuilder sb=new StringBuilder();
        while(n>0){
            if(n%2==1) sb.append('1');
            else sb.append('0');
            n/=2;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Convert_Binary(n));
    }
}
