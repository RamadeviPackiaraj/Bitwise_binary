import java.util.*;
public class Binary_to_Decimall{
public static double Binary_to_Decimal(String s){
    int n=s.length();
    double num=0;
    int count=0;
    for(int i=n-1;i>=0;i--){
        if(s.charAt(i)!='0'&&s.charAt(i)!='1'){
            throw new IllegalArgumentException("Invalid");
        }
        if(s.charAt(i)=='1'){
            num= num + Math.pow(2,count);
        }
         count++;
    }
    return num;
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    try{
        System.out.println(Binary_to_Decimal(s));

    }
    catch(IllegalArgumentException e){
        System.out.println(e.getMessage());
    }
}
}