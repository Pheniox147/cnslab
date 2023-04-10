import javax.crypto.Cipher; 
import javax.crypto.KeyGenerator; 
import javax.crypto.SecretKey; 
import javax.swing.JOptionPane; 

public class BlowFishCipher {
 public static void main(String[] args) throws Exception { 

KeyGenerator keygenerator = KeyGenerator.getInstance("Blowfish"); 

Cipher cipher = Cipher.getInstance("Blowfish"); 
SecretKey secretkey= keygenerator.generateKey();

cipher.init(Cipher.ENCRYPT_MODE, secretkey); 

String inputText = JOptionPane.showInputDialog("Input your message:"); 
byte[] encrypted = cipher.doFinal(inputText.getBytes()); 
 
cipher.init(Cipher.DECRYPT_MODE, secretkey); 

byte[] decrypted = cipher.doFinal(encrypted); 


JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), 
"\nEncrypted text: " + new String(encrypted) + "\n" + 
"\nDecrypted text: " + new String(decrypted)); 
System.exit(0); 
} } 

