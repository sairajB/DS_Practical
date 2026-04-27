## How to Run (in order)

# Step 1 - Compile everything

javac \*.java

# Step 2 - Start RMI Registry (keep this terminal open)

rmiregistry

# Step 3 - Start Server (new terminal)

java MilesServer

# Step 4 - Run Client (new terminal)

java MilesClient
