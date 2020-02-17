import socket

# socket for RPi connection
client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect(('192.168.137.10', 65432))

if bool(client.recv(1024).decode()): 
	client.close()