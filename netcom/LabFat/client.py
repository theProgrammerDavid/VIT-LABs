import socket 
import config
import hashlib
from cryptography.fernet import Fernet



# def encrypt(str):
# 	encoded_input = str.encode('utf-8')
# 	hash_sha1 = hashlib.sha1(encoded_input)
# 	return hash_sha1.hexdigest()

def decrypt(token: bytes, key: bytes) -> bytes:
    return Fernet(key).decrypt(token)

def encryptAsString(message: bytes, key: bytes) -> bytes:
    return Fernet(key).encrypt(message)

client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
HOST = socket.gethostname()
PORT = config.PORT

client_socket.connect((HOST, PORT))
msg = client_socket.recv(1024)

x=msg.decode('utf-8')
# print(decrypt(x.encode('utf-8'), config.KEY).decode('utf-8'))
if (decrypt(x.encode('utf-8'), config.KEY).decode('utf-8'))==config.VALIDATION_MESSAGE:
    print('secure connection')

print('Sending Username')
x = encryptAsString("someUsernameHere".encode('utf-8'), config.KEY)
client_socket.send(x)

print('Sending Password')
x = encryptAsString("somePasswordHere".encode('utf-8'), config.KEY)
client_socket.send(x)



client_socket.close()
