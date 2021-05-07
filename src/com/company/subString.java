package com.company;

public class subString {
    public static void main(String[] args) {
        String sentence = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
        String s1 = sentence.substring(3);//截取从第3个开始的字符串 （基0）
        System.out.println(s1);

        String s2 = sentence.substring(4,7);//截取从第4个开始的到第6个字符串 （基0）
        System.out.println(s2);
    }
}
