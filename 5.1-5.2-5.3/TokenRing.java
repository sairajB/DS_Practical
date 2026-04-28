public class TokenRing {

    static int n = 5;           // number of processes
    static int token = 0;       // token starts at process 0
    static boolean[] wants_to_enter = {true, false, true, false, true};
    // processes 0, 2, 4 want to enter critical section

    public static void main(String[] args) {

        System.out.println("Total Processes: " + n);
        System.out.println("Token starts at Process: " + token);
        System.out.println();

        // Run the ring for 2 full rounds
        for (int round = 1; round <= 2; round++) {
            System.out.println("===== Round " + round + " =====");

            for (int i = 0; i < n; i++) {

                System.out.println("\nToken at Process: " + i);

                if (wants_to_enter[i]) {
                    System.out.println("Process " + i + " --> Entering Critical Section");
                    System.out.println("Process " + i + " --> Working...");
                    System.out.println("Process " + i + " --> Exiting Critical Section");
                } else {
                    System.out.println("Process " + i + " --> Does not need Critical Section");
                    System.out.println("Process " + i + " --> Passing token to next process");
                }

                // Pass token to next process in ring
                int next = (i + 1) % n;
                System.out.println("Token passed from Process " + i + " to Process " + next);
            }

            System.out.println();
        }

        System.out.println("Token Ring Algorithm Completed.");
    }
}
