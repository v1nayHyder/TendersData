package geeksforgeeks;

class Solution {
   static int missingNumber(int array[], int n) {
        int total = (n * (n + 1)) / 2; // Corrected the sum calculation formula
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return total - sum;

    }

    public static void main(String[] args) {
        int vale[]={0,1,2,3,5};
        System.out.println(missingNumber(vale,vale.length-1));
    }
}