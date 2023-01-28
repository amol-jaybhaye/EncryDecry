package coolApps;

import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class EncryDecry {
	
	public static byte[] Encrypt(Cipher desChip, SecretKey myDesKey, byte[] text) {
		byte[] textEncry = null;
		try {
			//Encrypting text here
			desChip.init(Cipher.ENCRYPT_MODE, myDesKey);
			textEncry = desChip.doFinal(text);
			
		}
		catch(Exception e){
			System.out.println("Exception");
		}
		return textEncry;
	}
	
	public static byte[] Decrypt(Cipher desChip, SecretKey myDesKey, byte[] textEncry) {
		byte[] textDecry = null;
		try {
			//Decrypting text
			desChip.init(Cipher.DECRYPT_MODE, myDesKey);
			textDecry = desChip.doFinal(textEncry);
		}
		catch(Exception e){
			System.out.println("Exception");
		}
		return textDecry;
	}
	
	public static void main(String[] args) {
		
		try {
			//generating object of KeyGenerator & SecretKey
			KeyGenerator keyGen = KeyGenerator.getInstance("DES");
			SecretKey myDesKey = keyGen.generateKey();
			//System.out.println("Security Key : " + myDesKey);
			
			//creating object of cipher
			Cipher desChip;
			desChip = Cipher.getInstance("DES");
			//System.out.println("Cipher instance : " + desChip);
			
			//byte code in short explain
			//byte[] bA = {'A', 'M', 'O', 'L'};			
			//String name = new String(bA);
			//System.out.println(name);
			
			//take input from user
			Scanner ui = new Scanner(System.in);
			System.out.print("Enter User Text: ");
			String userText = ui.nextLine();
			
			//byte array to store string
			byte[] text = userText.getBytes("UTF8");
			
			//encrypted byte
			byte[] textEncry = EncryDecry.Encrypt(desChip, myDesKey, text);
			
			//convert encrypted byte array to string
			String s = new String(textEncry);
			System.out.println(s);
			
			//Decrypted byte
			byte[] textDecry = EncryDecry.Decrypt(desChip, myDesKey, textEncry);
			
			//convert Decrypted byte array to string
			s= new String(textDecry);
			System.out.println(s);
			
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
	}

}
