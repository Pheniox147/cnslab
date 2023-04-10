/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pheniox
 */
import java.io.*;
import java.util.*;

public class SubstitutionCipher {
    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws IOException{
        String a="abcdefghijklmnopqrstuvwxyz";
        String b="zyxwvutsrqponmlkjihgfedcba";
        System.out.print("enter only string:");
        String str=br.readLine();
        String decrypt="";
        char c;
        for(int i=0;i<str.length();i++){
            c=str.charAt(i);
            int j=a.indexOf(c);
            decrypt=decrypt+b.charAt(j);
        }
        System.out.println("the encrypted deal is :"+decrypt);
    }
}
