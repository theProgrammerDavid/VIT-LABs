import socket
import hashlib
import config
from cryptography.fernet import Fernet

def encrypt(str):
	encoded_input = str.encode('utf-8')
	hash_sha1 = hashlib.sha1(encoded_input)
	return hash_sha1.hexdigest()

def encryptAsString(message: bytes, key: bytes) -> bytes:
    return Fernet(key).encrypt(message)

def decrypt(token: bytes, key: bytes) -> bytes:
    return Fernet(key).decrypt(token)


server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
HOST = socket.gethostname()
PORT = config.PORT
MAX_REQUESTS = config.MAX_REQUESTS

server_socket.bind((HOST, PORT))
server_socket.listen(MAX_REQUESTS)

while True:
	client_socket, addr = server_socket.accept()

	print("Connected with: ", str(addr))
	x = encryptAsString(config.VALIDATION_MESSAGE.encode('utf-8'), config.KEY)
	print("Connection Key : "+str(x.decode('utf-8')))
	client_socket.send(x)

	msg = client_socket.recv(1024)
	msg=msg.decode('utf-8')
	print(decrypt(msg.encode('utf-8'), config.KEY).decode('utf-8'))

	msg = client_socket.recv(1024)
	msg=msg.decode('utf-8')
	print(decrypt(msg.encode('utf-8'), config.KEY).decode('utf-8'))

	client_socket.close()
