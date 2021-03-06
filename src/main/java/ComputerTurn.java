import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Random;


public class ComputerTurn {

    public static String bytesToHex(byte[] bytes) {


        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    public byte[] createKey() {
        SecureRandom random = new SecureRandom();
        byte[] key = random.generateSeed(16);
        return key;
    }

    public int numberSelection(int numberOptions) {
        Random randNumber = new Random();
        int number = randNumber.nextInt(numberOptions - 1) + 1;
        return number;
    }

    static public byte[] calcHmacSha256(byte[] key, int number) {
        byte[] hmacSha256 = null;
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, "HmacSHA256");
            mac.init(secretKeySpec);
            hmacSha256 = mac.doFinal(ByteBuffer.allocate(4).putInt(number).array());
        } catch (Exception e) {
            throw new RuntimeException("Failed to calculate hmac-sha256", e);
        }
        return hmacSha256;
    }
}
