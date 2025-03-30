import java.io.*;
import java.net.*;
import message.Message;
import message.MessageOuterClass;

public class Server3 {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(9092)) {
            while (true) {
                Socket socket = serverSocket.accept();
                InputStream input = socket.getInputStream();
                OutputStream output = socket.getOutputStream();
                
                byte[] buffer = new byte[1024];
                int bytesRead = input.read(buffer);
                Message message = MessageOuterClass.Message.parseFrom(buffer, 0, bytesRead);

                if (message.getDemand().equals("STRT")) {
                    Message response = Message.newBuilder()
                        .setDemand(message.getDemand())
                        .setResponse("YEP")
                        .build();
                    output.write(response.toByteArray());
                } else if (message.getDemand().equals("DEL")) {
                    Message response = Message.newBuilder()
                        .setDemand(message.getDemand())
                        .setResponse("NOP")
                        .build();
                    output.write(response.toByteArray());
                }

                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
