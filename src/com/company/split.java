package com.company;

public class split {
    public static void main(String[] args) {
        String sentence = "盖伦,在进行了连续8次击杀后,获得了超神的称号";

        String[] sc = sentence.split(",");//根据,进行分割得到3个子字符串
        for (String sub : sc){
            System.out.println(sub);
        }
    }
}
