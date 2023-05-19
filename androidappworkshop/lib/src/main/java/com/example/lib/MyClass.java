package com.example.lib;

public class MyClass {
    static String text = "Today, we aRe GoinG to try AnDroid Development";
    public static void main(String[] args) {
        run(text);
    }
    public static void run(String text){
        String ans = "";
        char[] temp = text.toCharArray();
        for(char c : temp){
            if((int)c >= 65 && (int)c <= 91){
                String t = c + "";
                ans += t.toLowerCase();
            }else {
                String t = c + "";
                ans += t.toUpperCase();
            }
        }
        System.out.println(ans);
    }
}