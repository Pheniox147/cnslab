/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pheniox
 */
import java.security.*;
public class MD5 {
    public static void main(String args[]){
        try{
        MessageDigest md =MessageDigest.getInstance("MD5");
        System.out.println("message Digest object Info:");
         System.out.println("Algorithm"+md.getAlgorithm());
          System.out.println("Provider"+md.getProvider());
           System.out.println("ToString"+md.toString());
        String input="";
        md.update(input.getBytes());
        byte[] output=md.digest();
        System.out.println("MD5("+input+")="+BytesToHex(output));
        System.out.println(" ");
        input="abc";
        md.update(input.getBytes());
        output=md.digest();
        System.out.println("MD5("+input+")="+BytesToHex(output));
        System.out.println(" ");
        input="abcdefghijklmnopqrstuvwxyz";
        md.update(input.getBytes());
        output=md.digest();
        System.out.println("MD5("+input+")="+BytesToHex(output));
        System.out.println(" ");
        
        
        
        
        }
        catch(Exception e){
            System.out.println("Exception:"+e);
        }
        
    }
    public static String BytesToHex(byte[] b){
        char hexdigit[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        StringBuffer buf=new StringBuffer();
        for(int j=0;j<b.length;j++){
            buf.append(hexdigit[(b[j]>>4)&0x0f]);
            buf.append(hexdigit[b[j]&0x0f]);
        }
        return buf.toString();
    }
    
}
