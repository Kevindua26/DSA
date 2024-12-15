package Practice.Searching.Linear.Array2D;

public class RichestCustomerWealth {
    //https://leetcode.com/problems/richest-customer-wealth
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {3, 8, 1}
        };
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int person = 0; person < accounts.length; person++) {
            int wealth = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                wealth += accounts[person][account];
            }
            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}
