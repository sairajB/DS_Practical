class TokenRing {

    public static void main(String[] args) {

        int n = 5;
        int token = 0;
        boolean[] need = {true, false, true, false, true};

        System.out.println("Token starts at process " + token);

        // run 2 rounds
        for (int r = 0; r < 2; r++) {
            System.out.println("\nRound " + (r + 1));

            for (int i = 0; i < n; i++) {

                System.out.println("Token at process " + token);

                if (need[token]) {
                    System.out.println("Process " + token + " using Critical Section");
                    need[token] = false;   // reset
                } else {
                    System.out.println("Process " + token + " does not need CS");
                }

                // pass token
                token = (token + 1) % n;
            }
        }

        System.out.println("\nExecution Completed");
    }
}
