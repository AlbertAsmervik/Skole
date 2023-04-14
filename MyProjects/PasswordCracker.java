package MyProjects;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PasswordCracker {
    private static final String CHARSET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
    private static final int MAX_PASSWORD_LENGTH = 10;
    private static final int MAX_THREADS = 8;
    private static final String PASSWORD_HASH = "098f6bcd4621d373cade4e832627b4f6"; 

    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");

        ExecutorService executor = Executors.newFixedThreadPool(MAX_THREADS);

        List<CrackerTask> tasks = new ArrayList<>();

        for (int passwordLength = 1; passwordLength <= MAX_PASSWORD_LENGTH; passwordLength++) {
            tasks.add(new CrackerTask(md, PASSWORD_HASH, passwordLength));
        }

        for (CrackerTask task : tasks) {
            executor.submit(task);
        }

        executor.shutdown();
    }

    private static class CrackerTask implements Runnable {
        private final MessageDigest md;
        private final String hash;
        private final int passwordLength;

        public CrackerTask(MessageDigest md, String hash, int passwordLength) {
            this.md = md;
            this.hash = hash;
            this.passwordLength = passwordLength;
        }

        @Override
        public void run() {
            crackPasswords("", passwordLength);
        }

        private void crackPasswords(String prefix, int length) {
            if (length == 0) {
                String password = prefix;
                String passwordHash = toHexString(md.digest(password.getBytes()));

                if (passwordHash.equals(hash)) {
                    System.out.println("Password cracked: " + password);
                    System.exit(0);
                }
            } else {
                for (int i = 0; i < CHARSET.length(); i++) {
                    char c = CHARSET.charAt(i);
                    crackPasswords(prefix + c, length - 1);
                }
            }
        }

        private String toHexString(byte[] bytes) {
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        }
    }
}
