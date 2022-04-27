package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class APP {
    public static void main(String[] args) {
        SpringApplication.run(APP.class);
        char[] chars = new char[26];
        int[] ints = new int[26];
        int a=0;
        int c=0;
        int d=0;
        boolean b = true ;
        String s ="";
        for (int i = 26; i > 0; i--) {
            chars[26-i]= (char)(123-i);

        }
        for (int i = 1; i < 27; i++) {
            ints[i-1]=i;

        }
        while (true){
            a++;
            if (b==true){
                s+=chars[d];
                d++;

            }else {
                s+=ints[c];
                c++;
            }
            if (a%8==0){
                b=!b;

            }
            if (a==50){

                break;
            }

        }
        System.out.println(s);
    }
}
