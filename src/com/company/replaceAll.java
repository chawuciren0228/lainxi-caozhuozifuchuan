package com.company;

public class replaceAll {
    public static void main(String[] args) {

        String sentence = "盖伦,在进行了连续8次击杀后,盖伦获得了 超神 的称号";

        String sc = sentence.replaceAll("在","再");
        sc = sc.replaceAll("连续","一直");

        System.out.println(sc);

        String sc1=sentence.replaceFirst("盖伦","寒冰");
        System.out.println(sc1);
    }
}
