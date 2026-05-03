class TokenRing {

    public static void main(String[] args) {

        int n = 5;
        int token = 0;
        
        // Arrays for Round 1 and Round 2
        boolean[] needRound1 = {true, false, true, false, true};
        boolean[] needRound2 = {false, true, false, true, false};
        
        System.out.println("Token starts at process " + token);

        // Round 1
        System.out.println("\n===== Round 1 =====");
        boolean[] need = needRound1;
        
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

        // Round 2
        System.out.println("\n===== Round 2 =====");
        need = needRound2;
        token = 0;
        
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

        System.out.println("\nExecution Completed");
    }
}
