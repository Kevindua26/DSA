package Notes.Searching.Linear;

public class LinearSearchString {
    public static void main(String[] args) {
        String Name = "Kaivalaya";
        int target = 'a';

        boolean result = Search(Name, (char) target);
        System.out.println("The character is present in the string: " + result);
    }

    static boolean Search(String str, char target) {
        // If string is empty
        if (str.isEmpty()) {   // (str.length() == 0)
            return false;
        }

        // If string is not empty then start a loop for the elements inside the string
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == target) {
                return true;
            }
        }

        // If the string doesn't contain the character (target)
        return false;
    }

    static boolean Search2(String str, char target) {
        if (str.isEmpty()) {   // (str.length() == 0)
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
