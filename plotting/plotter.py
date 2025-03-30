import socket
import pickle
import matplotlib.pyplot as plt
import threading
import time

# Sunucuların kapasite verilerini saklayacak
data = {"Server1": [], "Server2": [], "Server3": []}

def update_graph():
    plt.ion()  # Anlık olarak grafiği güncellemek için
    while True:
        plt.clf()
        for server, values in data.items():
            plt.plot(values, label=server)  # Her sunucunun verilerini çiz
        plt.legend()
        plt.pause(5)  # Grafiği 5 saniyede bir güncelle

def handle_client(conn):
    global data
    while True:
        try:
            # Gelen veriyi al ve deserialize et
            capacity = pickle.loads(conn.recv(1024))
            server_id = capacity["server_id"]
            server_status = capacity["server_status"]

            if server_id in data:
                data[server_id].append(server_status)  # Kapasite verisini sakla
        except:
            break

def start_server():
    server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server.bind(("localhost", 5000))  # Plotter'ın dinlediği port
    server.listen(5)
    print("Plotter server is running...")
    while True:
        conn, addr = server.accept()
        threading.Thread(target=handle_client, args=(conn,)).start()

# Grafiği ve sunucuyu başlatmak için iki thread
threading.Thread(target=update_graph).start()
start_server()
