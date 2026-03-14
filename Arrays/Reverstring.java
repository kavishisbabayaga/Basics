/*
Question:
You are given a string s.
Your task is to return the reverse of the given string.
Reversing means the last character becomes the first, the second last becomes the second, and so on.

Example:
Input:
s = "hello"

Output:
"olleh"
*/
public class Reverstring{
    public static String Reverse(String s){
        String reversed = "";

        for(int i = s.length() - 1 ; i >= 0 ; i--){
            reversed = reversed + s.charAt(i);
        } 
        return reversed;
    }

    public static void main(String[] args){
        String s = "hello";
        System.out.println(Reverse(s));
    }
}