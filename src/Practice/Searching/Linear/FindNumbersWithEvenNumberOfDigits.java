package Practice.Searching.Linear;


public class FindNumbersWithEvenNumberOfDigits {
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits
    public static void main(String[] args) {
        int nums[] = {12, 345, 2, 6, 7896};
        int count = 0;

        for (int num : nums){
            if (EvenDigits(num)){
                count++;
            }
        }

        System.out.println(count);
    }

    static boolean EvenDigits(int num) {
        return Count2(num) % 2 == 0;
    }

    static int Count2(int num) {
        if (num < 0) {
            num *= -1;
        }
        return (int) (Math.log10(num) + 1);
    }

    static int Count(int num) {
        int count = 0;

        if (num < 0) {
            num *= -1;
        } else if (num == 0) {
            return 1;
        }

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }
}
