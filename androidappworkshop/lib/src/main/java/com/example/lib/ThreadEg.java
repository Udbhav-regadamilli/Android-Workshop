package com.example.lib;

class t1 implements Runnable {
    String text;
    t1(String text){
        this.text = text;
    }

    @Override
    public void run() {
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

public class ThreadEg {
    public static void main(String[] args) {
        String text = "Today, we aRe GoinG to try AnDroid Development at gVp";
        t1 t = new t1(text);
        Thread T = new Thread(t);
        T.start();
    }
}
