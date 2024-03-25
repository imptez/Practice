import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class EncryptionDecryptionExample {

    public static void main(String[] args) throws Exception {
        // Generate a secret key
        SecretKey secretKey = generateSecretKey();

        // Original message
        String originalMessage = "Hello, Encryption and Decryption Example!";

        // Encrypt the message
        String encryptedMessage = encrypt(originalMessage, secretKey);
        System.out.println("Encrypted Message: " + encryptedMessage);

        // Decrypt the message
        String decryptedMessage = decrypt(encryptedMessage, secretKey);
        System.out.println("Decrypted Message: " + decryptedMessage);
    }

    private static SecretKey generateSecretKey() throws Exception {
        // Generate a secret key using AES algorithm
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128); // 128-bit key size
        return keyGenerator.generateKey();
    }

    private static String encrypt(String message, SecretKey secretKey) throws Exception {
        // Get Cipher instance and set it to encrypt mode
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        // Encrypt the message
        byte[] encryptedBytes = cipher.doFinal(message.getBytes());

        // Encode the encrypted bytes to Base64 for better representation
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    private static String decrypt(String encryptedMessage, SecretKey secretKey) throws Exception {
        // Get Cipher instance and set it to decrypt mode
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        // Decode Base64 and decrypt the message
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedMessage);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);

        // Convert the decrypted bytes to String
        return new String(decryptedBytes);
    }
}
