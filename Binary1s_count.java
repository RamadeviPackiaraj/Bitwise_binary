import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // input number
        int count = 0;

        // Loop through all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            int num = i;

            // Count set bits of current number
            while (num > 0) {
                if(num%2!=0){
                count ++;
                }// add 1 if last bit is set
                num/=2;          // right shift
            }
        }

        System.out.println(count);
        sc.close();
    }
}
