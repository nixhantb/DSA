class Palindrome {
    public boolean isPalindrome(int x) {

        int temp_sum = 0;

        if (x < 0) {
            return false;
        }

        int n = x;
        while (n != 0) {
            int r = n % 10;
            temp_sum = temp_sum * 10 + r;
            n /= 10;
        }

        if (temp_sum == x) {
            return true;
        }
        return false;
    }
}