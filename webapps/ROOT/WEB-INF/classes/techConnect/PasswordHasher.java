//package techConnect;
//
//import javax.crypto.SecretKeyFactory;
//import javax.crypto.spec.PBEKeySpec;
//import java.security.NoSuchAlgorithmException;
//import java.security.spec.InvalidKeySpecException;
//
//public class PasswordHasher {
//    private static final int ITERATIONS = 1000;
//    private static final String ALGORITHM = "PBKDF2WithHmacSHA1"
//
//    public static void main(String[] args) {
//
//    }
//
//    public static PBEKeySpec generateHash(String password) {
//
//    }
//
//    public static boolean validatePassword(String inputPassword, PBEKeySpec storedKey) {
//        try {
//            PBEKeySpec comparisonKey = new PBEKeySpec(inputPassword.toCharArray(), storedKey.getSalt(), storedKey.getIterationCount());
//            SecretKeyFactory skf = SecretKeyFactory.getInstance(ALGORITHM);
//            byte[] comparisonHash = skf.generateSecret(comparisonKey).getEncoded();
//
//            int diff = storedKey.getPassword().length ^
//
//
//        }
//        catch (NoSuchAlgorithmException e) {
//            System.out.println("There was an error with password validation using the following Algorithm: " + ALGORITHM);
//        }
//        catch (InvalidKeySpecException e) {
//            System.out.println("There was an error with password validation using the following KeySpec: " + storedKey);
//        }
//    }
//
//    public static int ByteArrayToInt(byte[] byteArray) {
//        int value = 0;
//        for (int i = 0; i < byteArray.length; i++) {
//            value += Math.pow(128, i);
//        }
//        return value;
//    }
//
//    public static byte[] IntToByteArray(int integer) {
//        for ()
//    }
//
//    public static class StoredKey {
//        private byte[] hash;
//        private byte[] salt;
//        private int iterations;
//        public StoredKey(String hash, String salt, )
//    }
//}
