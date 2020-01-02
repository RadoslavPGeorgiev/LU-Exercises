public class Main {

    public static boolean IsPalindrome(String string)
    {
        for  (int i = string.length()-1; i >= string.length() / 2; i--) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(IsPalindrome("reDivider"));
    }
}
