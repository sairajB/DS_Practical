class TokenRingElection {

    public static void main(String[] args) {

        int n = 5;
        int[] process = {0, 1, 2, 3, 4};  // process IDs
        boolean[] active = {true, true, true, true, true};

        int initiator = 2;  // process starting election

        System.out.println("Processes in ring:");
        for (int i = 0; i < n; i++) {
            if (active[i]) {
                System.out.print(process[i] + " ");
            }
        }

        System.out.println("\n\nProcess " + initiator + " starts election");

        int current = initiator;
        int maxId = initiator;

        // Pass token around ring once
        do {
            System.out.println("Token at process " + current);

            if (active[current]) {
                if (current > maxId) {
                    maxId = current;
                }
            }

            current = (current + 1) % n;

        } while (current != initiator);

        // Final leader
        System.out.println("\nLeader elected is: " + maxId);
    }
}