package com.company;

public class zuihoubiandaxie {
    public static void main(String[] args) {
        String sentence = "legendary";
        System.out.println(sentence);
        int digital = sentence.length();
        //System.out.println(digital);

        char word = Character.toUpperCase(sentence.charAt(digital-1));
        String result=" ";
        result=sentence.substring(0,8)+word;
        System.out.println(result.trim());
    }
}
