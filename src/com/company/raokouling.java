package com.company;

public class raokouling {
    public static void main(String[] args) {

        int j = 0 ;
        String sentence = "peter piper picked a peck of pickled peppers ";
        System.out.println(sentence+"\n这句话一共有多少个以p开头的单词");

        String[] fenkai = sentence.split(" ");

        for ( int i = 0 ; i<fenkai.length ; i++){
            String ward = fenkai[i];
            char initials = Character.toLowerCase(ward.charAt(0));
            if (initials == 'p'){
              j+=1;
            }
        }
        System.out.println(j);
    }
}
