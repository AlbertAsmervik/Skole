package MyProjects;


public class BruteForce {
    public static void main(String[] args) {
        bruteForce(10, "Albert2001");
    }

    public static void bruteForce(int size, String target) {
        int[] passwordIndices = new int[size];
        bruteForceRecursive(size, passwordIndices, 0, target);
    }

    private static void bruteForceRecursive(int size, int[] passwordIndices, int position, String target) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < characters.length(); i++) {
            passwordIndices[position] = i;
            if (position != size - 1) {
                bruteForceRecursive(size, passwordIndices, position + 1, target);
            } else {
                StringBuilder assembledPassword = new StringBuilder();
                for (int index : passwordIndices) {
                    assembledPassword.append(characters.charAt(index));
                }
                String currentAttempt = assembledPassword.toString();
                System.out.println(currentAttempt);
                if (currentAttempt.equalsIgnoreCase(target)) {
                    System.out.println("Password is: " + currentAttempt);
                    System.exit(0);  // exit
                }
            }
        }
    }
}
