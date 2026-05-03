import java.util.Scanner;

class TokenRing {

    public static void main(String[] args) {

        int n = 5;
        int token = 0;
        boolean[] need = {true, false, true, false, true};
        Scanner sc = new Scanner(System.in);

        System.out.println("Token starts at process " + token);

        // run 2 rounds
        for (int r = 0; r < 2; r++) {
            System.out.println("\nRound " + (r + 1));

            for (int i = 0; i < n; i++) {

                System.out.println("Token at process " + token);

                if (need[token]) {
                    System.out.println("Process " + token + " using Critical Section");
                    need[token] = false;
                } else {
                    System.out.println("Process " + token + " does not need CS");
                }

                token = (token + 1) % n;
            }

            // Ask for Round 2 preferences
            if (r == 0) {
                System.out.println("\nEnter processes for Round 2 (comma-separated, e.g., 0,2,4): ");
                String input = sc.nextLine();
                
                for (int j = 0; j < n; j++) {
                    need[j] = false;
                }
                
                if (!input.isEmpty()) {
                    for (String p : input.split(",")) {
                        int processNum = Integer.parseInt(p.trim());
                        need[processNum] = true;
                    }
                }
            }
        }

        System.out.println("\nExecution Completed");
        sc.close();
    }
}
