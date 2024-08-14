package org.example;

public class StringPractice {
    public static void main(String[] args) {
//        String is a object and array of character,
        String s1 = "Hello Team";
        String []s2 = s1.split(" ");
//        The splitted string is always forms an array with the delimiters
        System.out.println(s1);

        System.out.println(s1.charAt(4));
//        We you the charAt for knowing the what character is present at that index
        String comparing ="hello team";
        System.out.println(s1.compareTo(comparing));

//        concat is used to join the two strings
        System.out.println(s1.concat(comparing));

//        contains is used to compare the character sequence is present or not and case senstive
        System.out.println(comparing.contains("hello"));

        System.out.println(comparing.toUpperCase());
        System.out.println(s1.toLowerCase());
//        It is to used to trim the string with the white spaces
        System.out.println(s1.trim());




    }
}
