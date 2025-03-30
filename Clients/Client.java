package clients;

import com.google.protobuf.*;
import message.Message;
import subscriber.Subscriber;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8081)) { // Connect to Server1
            OutputStream out = socket.getOutputStream();
            
            // Example: Subscribe
            Subscriber subscriber = Subscriber.newBuilder()
                .setId(1)
                .setNameSurname("Jane DOE")
                .setStartDate(1729802522)
                .setLastAccessed(1729806522)
                .addInterests("sports")
                .setIsOnline(true)
                .build();
                
            Message message = Message.newBuilder()
                .setDemand("SUBS")
                .setSubscriber(subscriber)
                .build();
            
            message.writeTo(out);
        } catch (Exception e) {
            System.err.println("Client error: " + e.getMessage());
        }
    }
}
