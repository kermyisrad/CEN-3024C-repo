package chapter11;

import java.io.*;
import java.net.*;
import java.util.Date;

public class Server {

    public static void main(String[] args) {

        try {
           
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server started at " + new Date());

            while (true) {
              
                Socket socket = serverSocket.accept();

                
                DataInputStream inputFromClient = new DataInputStream(
                    socket.getInputStream());
                DataOutputStream outputToClient = new DataOutputStream(
                    socket.getOutputStream());

               
                int number = inputFromClient.readInt();

                
                outputToClient.writeUTF(isPrime(number));

                System.out.println("Number received from client: " + number);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

  
    public static String isPrime(int num) {
        if(num < 2) {
            return "No";
        }
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return "No";
            }
        }
        return "Yes";      
    }
}
