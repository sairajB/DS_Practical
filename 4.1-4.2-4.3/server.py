import socket
import datetime

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind(('localhost', 8080))
server.listen(5)
print("Master Server Started...")

while True:
    client_socket, addr = server.accept()
    print(f"\nClient connected: {addr}")

    master_time = datetime.datetime.now()
    print(f"Master Time: {master_time}")

    data = client_socket.recv(1024).decode()
    client_time = datetime.datetime.strptime(data, "%H:%M:%S.%f")
    print(f"Client Time: {client_time}")

    # Calculate average (midpoint between master and client times)
    avg_diff = (client_time - master_time).total_seconds() / 2
    synchronized_time = master_time + datetime.timedelta(seconds=avg_diff)
    print(f"Synchronized Time: {synchronized_time}")

    client_socket.send(str(synchronized_time).encode())
    client_socket.close()
