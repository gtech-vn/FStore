package org.fstore.Lib;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utils {
	public static String generatePassword(String txt)
	{
		 // getInstance() method is called with algorithm SHA-512 
        MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-512");
		

        byte[] messageDigest = md.digest(txt.getBytes()); 

        BigInteger no = new BigInteger(1, messageDigest); 

        String hashtext = no.toString(16); 

        while (hashtext.length() < 32) { 
            hashtext = "0" + hashtext; 
        } 

        return hashtext; 
        
		} catch (NoSuchAlgorithmException e) {
			return txt;
		} 
	}
}
