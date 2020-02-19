import socket

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.settimeout(5)
client.connect(('192.168.137.10', 65432))


flag = bool(client.recv(1024).decode())

if flag:
    client.close()