package com.company;

import java.util.Locale;

public class lettherebelight {
    public static void main(String[] args) {
        String sc ="let there be light";
        System.out.println(sc);

        String[] fenkai = sc.split(" ");//split通过” “()空格分开各个单词

        for (int i = 0; i < fenkai.length; i++){//依次拿出每个单词
//            System.out.println(fenkai[i])
            String ward = fenkai[i];
            char wards = Character.toUpperCase(ward.charAt(0));//charAt(0)选择把第一个单词的单独拉出来并通过toUpperCase变为大写单次
            String Remaining = ward.substring(1);//substring(1)通过找出第二个单词开始的整个单词
            String combination = wards+Remaining;//相加
            fenkai[i]=combination;//赋值回原位
        }
        String result = "";
        for (String ward : fenkai){//依次遍历所有fenkai组的所有组
            result += ward+ " ";//所有组依次相加
        }
        result=result.trim();//删去开头结尾的多余空格
        System.out.println(result);//输出
    }
}
