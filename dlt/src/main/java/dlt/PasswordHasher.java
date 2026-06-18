package dlt;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

public class PasswordHasher {

    // Generate a unique, cryptographically strong salt
    public static byte[] generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return salt;
    }

    // Hash the password using PBKDF2
    public static String hashPassword(char[] password, byte[] salt) 
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        
        int iterations = 210_000; // High iteration count defense against brute-force
        int keyLength = 256;      // Size of the generated hash
        
        PBEKeySpec spec = new PBEKeySpec(password, salt, iterations, keyLength);
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        
        byte[] hash = factory.generateSecret(spec).getEncoded();
        
        // Encode to Base64 to store easily in your database
        return Base64.getEncoder().encodeToString(hash);
    }
}