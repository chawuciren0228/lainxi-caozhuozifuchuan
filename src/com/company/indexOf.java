package com.company;

public class indexOf {
    public static void main(String[] args) {
        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";

        System.out.println(sentence.indexOf("在"));//“在”字符出现的第一次的位置
        System.out.println(sentence.indexOf("8"));//“8”字符出现的第一次的位置
        System.out.println(sentence.lastIndexOf("了"));//“了”字符出现的最后一次的位置
        System.out.println(sentence.indexOf('8',5));//"8"字符从第五个字符开始的第一次的位置
        System.out.println(sentence.contains("在"));//是否包含“在”字符
    }
}
