package mutable_immutable;

import sun.font.FontRunIterator;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
        System.out.println(reverse("Good morning"));
        System.out.println(reverse(""));
        System.out.println(reverse("a"));

        System.out.println(isPalindrome("civic"));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("Madam")); //false
        System.out.println(isPalindrome("hello")); //false
    }
    public static String reverse (String str){
       return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str){
        //return new StringBuilder(str).reverse().toString().equals(str);
        return str.equals(new StringBuilder(str).reverse().toString());
    }

}
