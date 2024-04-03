package org.phenom;

public class ReverseInteger2 {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
     public static int reverse(int num) {
        int rem=0,sum=0,count=0;
        if (num<0){
         num=Math.abs(num);
         count++;
        }
        if (num<2147483647&&num>-2147483648) {
            while (num > 0) {
                rem = num % 10;
                sum = sum * 10 + rem;
                num /= 10;
            }
            if (count == 1) {
                return -sum;
            }
        }
            return sum;

    }
}
