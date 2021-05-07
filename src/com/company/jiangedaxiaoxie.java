package com.company;

import java.util.Scanner;

public class jiangedaxiaoxie {
    public static void main(String[] args) {

        String result = " ";

        System.out.println("请输入一串英文代码，谢谢");
        Scanner scanner =new Scanner(System.in);
        String obtain = scanner.next();

        for (int i=0 ; i<obtain.length() ; i++){//单独拿出一个字母
            char word = obtain.charAt(i);
//            System.out.println(word);
            String words=" ";
            if (i%2==0){
                words = String.valueOf(Character.toUpperCase(word));//双数时，大写
            }else {
                words = String.valueOf(Character.toLowerCase(word));//单数时，小写
            }
            result+=words;//重新组合

        }
        System.out.println(result.trim());
    }
}
