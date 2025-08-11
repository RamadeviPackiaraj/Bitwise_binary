class Solution {
    public int findComplement(int num) {
        return Decimal(Binary(num));
    }
    public String Binary(int num){
        StringBuilder sb=new StringBuilder();
        while(num>0){
        if(num%2==0) sb.append('1');
        else sb.append('0');
        num/=2;
        }
        return sb.reverse().toString();
    }
    public int Decimal(String s){
        int num=0;
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)=='1'){
            num+=Math.pow(2,count);
        }
        count++;
        }
        return num;
    }
}