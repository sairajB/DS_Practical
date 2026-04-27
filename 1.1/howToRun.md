## How to Run (in order)

# bash Step 1 - Compile everything
javac *.java

# Step 2 - Start RMI Registry (keep this terminal open)
rmiregistry

# Step 3 - Start Server (new terminal)
java AddServer

# Step 4 - Run Client (new terminal)
java AddClient