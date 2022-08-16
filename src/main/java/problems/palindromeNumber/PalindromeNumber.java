package problems.palindromeNumber;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x % 10 == 0 && x != 0) {
            return false;
        }

        int palindromeCandidate = 0;
        int xCopy = x;

        while (xCopy != 0) {
            palindromeCandidate = palindromeCandidate * 10 + xCopy % 10;
            xCopy = xCopy / 10;
        }
        return palindromeCandidate == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(337733));
        System.out.println(isPalindrome(1234567899));
    }
}
