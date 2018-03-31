package com.fpinki.casee;

import java.util.Scanner;

public class CaseExample {
    public static void main(String[] args) {

        System.out.println("Enter a character:");
        Scanner scanner = new Scanner(System.in);
        Character ch = scanner.next().charAt(0);
        System.out.println("Value of ch:" + ch);
        boolean isVowel = false;

        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                isVowel = true;
                break;
        }

        if (isVowel){
            System.out.println("Vowel");
        }
        else
        {
            if ( ch >= 'a' && ch <= 'z'){
                System.out.println("Consonant");
            }
            else
            {
                System.out.println("Badmaas enter a character");
            }
        }


    }
}
