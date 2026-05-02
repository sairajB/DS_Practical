class Bully {

    static int n = 5;
    static boolean[] active = {true, true, true, true, true};
    static int coordinator = 4; // highest ID initially

    // Election function
    static void election(int initiator) {
        System.out.println("\nProcess " + initiator + " starts election");

        boolean higherFound = false;

        for (int i = initiator + 1; i < n; i++) {
            if (active[i]) {
                System.out.println("Process " + initiator + " sends ELECTION to " + i);
                higherFound = true;
            }
        }

        if (!higherFound) {
            coordinator = initiator;
            System.out.println("Process " + initiator + " becomes COORDINATOR");
        } else {
            for (int i = initiator + 1; i < n; i++) {
                if (active[i]) {
                    election(i);  // higher process takes over
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Initial Coordinator: " + coordinator);

        // Simulate coordinator failure
        System.out.println("\nCoordinator " + coordinator + " fails!");
        active[coordinator] = false;

        // Start election from process 2
        election(2);

        System.out.println("\nFinal Coordinator is: " + coordinator);
    }
}