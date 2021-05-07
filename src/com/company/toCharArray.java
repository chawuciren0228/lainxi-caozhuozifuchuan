package com.company;

public class toCharArray {

    public static void main(String[] args) {
        String sentence = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
        char[] sc = sentence.toCharArray();//获取对应的字符数组
        System.out.println(sentence.length());
        System.out.println(sc.length);
    }
}
