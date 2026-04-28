import socket
import datetime

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect(('localhost', 8080))

# Step 1 - Send current client time to master
my_time = datetime.datetime.now().strftime("%H:%M:%S.%f")
print(f"My Current Time: {my_time}")
client.send(my_time.encode())

# Step 2 - Receive synchronized time from master
sync_time = client.recv(1024).decode()
print(f"Synchronized Time from Master: {sync_time}")

client.close()
